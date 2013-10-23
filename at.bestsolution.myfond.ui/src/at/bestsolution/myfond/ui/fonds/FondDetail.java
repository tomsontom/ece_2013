package at.bestsolution.myfond.ui.fonds;

import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;

public class FondDetail {
	@PostConstruct
	void init(BorderPane parent) {
		BorderPane p = new BorderPane();
		p.getStyleClass().add("viewContent");
		
		parent.setCenter(p); 
	}
}
