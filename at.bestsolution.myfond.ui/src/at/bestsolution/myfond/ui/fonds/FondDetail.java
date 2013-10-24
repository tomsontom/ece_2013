package at.bestsolution.myfond.ui.fonds;

import java.io.IOException;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.fx.ui.di.FXMLLoader;
import org.eclipse.fx.ui.di.FXMLLoaderFactory;

public class FondDetail {
	@Inject
	@FXMLLoader
	FXMLLoaderFactory factory;

	@PostConstruct
	void init(BorderPane parent) {
		BorderPane p = new BorderPane();
		p.getStyleClass().add("viewContent");
		
		try {
			p.setCenter(factory.<Node>loadRequestorRelative("FondDetailUI.fxml").load());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		parent.setCenter(p); 
	}
}
