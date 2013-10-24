package at.bestsolution.myfond.ui.fonds;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;

public class FondHeader {
	@PostConstruct
	void init(BorderPane parent) {
		Label l = new Label("Fondadministration", new ImageView(getClass().getClassLoader().getResource("/icons/header/kspread.png").toExternalForm()));
		l.getStyleClass().add("perspectiveHeader");
		l.setGraphicTextGap(20);
		parent.setCenter(l);
	}
}
