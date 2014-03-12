package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.model.Fond;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

import org.eclipse.fx.core.fxml.ExtendedFXMLLoader;
import org.eclipse.fx.core.fxml.ExtendedFXMLLoader.Data;
import org.eclipse.fx.ui.mobile.Card;
import org.eclipse.fx.ui.mobile.Deck;
import org.eclipse.fx.ui.mobile.TransitionType;

public class MainPageController implements Initializable {

	@FXML ListView<Fond> fondList;
	@FXML Deck fondDeck;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DatasourceProvider pv = new DatasourceProvider();
		
		fondList.setCellFactory(new Callback<ListView<Fond>, ListCell<Fond>>() {
			
			@Override
			public ListCell<Fond> call(ListView<Fond> param) {
				return new ListCell<Fond>() {
					@Override
					protected void updateItem(Fond item, boolean empty) {
						textProperty().unbind();
						
						if( item != null && ! empty ) {
							textProperty().bind(item.nameProperty());
						} else {
							setText(null);
						}
						super.updateItem(item, empty);
					}
				};
			}
		});
		fondList.setFixedCellSize(60);
		fondList.setItems(pv.getFonds());
		fondList.getSelectionModel().selectedItemProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable observable) {
				Fond fond = fondList.getSelectionModel().getSelectedItem();
				for( Card c : fondDeck.getCards() ) {
					if( fond.getId().equals(c.getName()) ) {
						fondDeck.moveTo(fond.getId(), TransitionType.FADE);
						return;
					}
				}
				
				try {
					Data<Card, FondCardController> data = ExtendedFXMLLoader.loadWithController(getClass().getClassLoader(), null, null, "application/FondCard.fxml");
					Card c = data.getNode();
					c.setName(fond.getId());
					FondCardController controller = data.getController();
					controller.setFond(fond);
					fondDeck.getCards().add(c);
					fondDeck.moveTo(fond.getId(), TransitionType.FADE);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
