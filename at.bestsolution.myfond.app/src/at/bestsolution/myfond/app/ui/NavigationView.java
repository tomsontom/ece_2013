package at.bestsolution.myfond.app.ui;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javax.annotation.PostConstruct;

public class NavigationView {
	private Node smallNavi;
	private Node bigNavi;
	private BorderPane p;
	
	@PostConstruct
	void initUI(BorderPane p) {
		this.p = p;
		smallNavi = createSmallNavi();
		bigNavi = createBigNavi();
		p.setCenter(smallNavi);
	}
	
	Node createSmallNavi() {
		Group g = new Group();
		
		HBox b = new HBox(20);
		b.getStyleClass().add("navigationContent");
		g.getChildren().add(b);
		
		{
			final ImageView l = new ImageView(new Image(getClass().getClassLoader().getResource("/icons/navigation/sm_kspread.png").toExternalForm()));
			b.getChildren().add(l);			
		}
		
		{
			final ImageView l = new ImageView(new Image(getClass().getClassLoader().getResource("/icons/navigation/sm_preferences-desktop.png").toExternalForm()));
			b.getChildren().add(l);			
		}
		
		b.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				p.setCenter(bigNavi);
			}
		});
		
		
		return g;
	}
	
	Node createBigNavi() {
		Group g = new Group();
		g.setTranslateY(-40);
		
		HBox b = new HBox(20);
		b.getStyleClass().add("navigationContent");
		g.getChildren().add(b);
		
		{
			final Label l = new Label("Fonds",new ImageView(new Image(getClass().getClassLoader().getResource("/icons/navigation/kspread.png").toExternalForm())));
			l.setContentDisplay(ContentDisplay.TOP);
			b.getChildren().add(l);			
		}
		
		{
			final Label l = new Label("Basic data",new ImageView(new Image(getClass().getClassLoader().getResource("/icons/navigation/preferences-desktop.png").toExternalForm())));
			l.setContentDisplay(ContentDisplay.TOP);
			b.getChildren().add(l);			
		}
		
		b.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				p.setCenter(smallNavi);
			}
		});
		
		return g;
	}
}
