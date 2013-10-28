package osgi.samplesolution.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {

	@FXML Button button;

	@FXML public void run() {
		button.setText("Clicked!!");
	}

}
