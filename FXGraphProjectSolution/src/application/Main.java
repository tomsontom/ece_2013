package application;
	
import java.util.ResourceBundle;

import org.eclipse.fx.core.databinding.JFXRealm;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		JFXRealm.createDefault();
		try {
			BorderPane root = FXMLLoader.load(getClass().getResource("Currency.fxml"), ResourceBundle.getBundle("application.messages"));
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
