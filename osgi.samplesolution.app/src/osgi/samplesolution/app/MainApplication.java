package osgi.samplesolution.app;

import java.io.IOException;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.fx.ui.di.FXMLLoader;
import org.eclipse.fx.ui.di.FXMLLoaderFactory;

public class MainApplication {
	@Inject
	@FXMLLoader
	FXMLLoaderFactory factory;
	
	@Inject
	public MainApplication() {
		
	}
	
	@PostConstruct
	void run(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {
		try {
			// ...
			BorderPane pane = (BorderPane) factory.loadRequestorRelative("Sample.fxml").load();
			Scene s = new Scene(pane);
			primaryStage.setScene(s);
			primaryStage.setWidth(300);
			primaryStage.setHeight(400);
			primaryStage.setTitle("Hello World");
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
