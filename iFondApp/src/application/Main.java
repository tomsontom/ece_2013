package application;

import javafx.scene.layout.Region;
import org.eclipse.fx.ui.mobile.Deck;
import org.eclipse.fx.ui.mobile.MobileApp;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Main extends MobileApp {

	public Region createUI() {
		try {
			Deck root = (Deck)FXMLLoader.load(getClass().getResource("MainPage.fxml"));
			return root;
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
