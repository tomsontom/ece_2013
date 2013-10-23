package at.bestsolution.myfond.ui.fonds;

import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;

import at.bestsolution.myfond.model.myfond.Fond;

public class FondList {
	@PostConstruct
	void init(BorderPane parent) {
		BorderPane p = new BorderPane();
		p.getStyleClass().add("viewContent");
		p.setCenter(createList());
		parent.setCenter(p);
	}
	
	private Node createList() {
		ListView<Fond> listView = new ListView<>();
		
		return listView;
	}
}
