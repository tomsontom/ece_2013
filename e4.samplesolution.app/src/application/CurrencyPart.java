package application;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.fx.ui.di.FXMLLoader;
import org.eclipse.fx.ui.di.FXMLLoaderFactory;

public class CurrencyPart {
	@Inject
	@FXMLLoader
	FXMLLoaderFactory factory;
	
	@PostConstruct
	void initUI(BorderPane pane) {
		try {
			pane.setCenter((Node) factory.loadRequestorRelative("Currency.fxml")
					.resourceBundle(ResourceBundle.getBundle("application.messages"))
					.load());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
