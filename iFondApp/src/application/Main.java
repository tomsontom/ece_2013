package application;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javafx.scene.layout.Region;

import org.eclipse.fx.core.fxml.ExtendedFXMLLoader;
import org.eclipse.fx.ui.mobile.Deck;
import org.eclipse.fx.ui.mobile.MobileApp;

public class Main extends MobileApp {

	public Region createUI() {
		try {
			Deck root = (Deck)new ExtendedFXMLLoader().load(getClass().getClassLoader(),"application/MainPage.fxml");
			return root;
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<String> getInitialStylesheets() {
		return Collections.singletonList(getClass().getResource("application.css").toExternalForm());
	}
}
