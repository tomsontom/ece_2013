package application;
	
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();

			// 1. Text field
			TextField inputField = new TextField();
			root.setTop(inputField);

			// 2. Text
			Text text = new Text();
			root.setCenter(text);
			
			// 3. Vertical slider
			Slider vSlide = new Slider();
			vSlide.setMin(1);
			vSlide.setMax(10);
			vSlide.setOrientation(Orientation.VERTICAL);
			root.setLeft(vSlide);

			// 4. Horizontal slider
			Slider hSlide = new Slider();
			hSlide.setMin(1);
			hSlide.setMax(10);
			root.setBottom(hSlide);
			
			
			MyBean b = new MyBean();
			b.textProperty().bindBidirectional(inputField.textProperty());
			
			text.textProperty().bind(b.textProperty());
			text.scaleXProperty().bind(hSlide.valueProperty());
			text.scaleYProperty().bind(vSlide.valueProperty());
			
			vSlide.disableProperty().bind(b.textProperty().isEmpty());
			hSlide.disableProperty().bind(b.textProperty().isEmpty());
			
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
