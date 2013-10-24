package at.bestsolution.myfond.ui.fonds;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.fx.core.databinding.AdapterFactory;
import org.eclipse.fx.ui.databinding.PropertyListCellFaytory;

import at.bestsolution.myfond.datasource.Datasource;
import at.bestsolution.myfond.model.myfond.Fond;
import at.bestsolution.myfond.model.myfond.MyfondPackage;


public class FondList {
	
	@Inject
	Datasource datasource;
	
	@Inject
	IEclipseContext context;
	
	@PostConstruct
	void init(BorderPane parent) {
		BorderPane p = new BorderPane();
		p.getStyleClass().add("viewContent");
		p.setCenter(createList());
		parent.setCenter(p);
	}
	
	private Node createList() {
		ListView<Fond> listView = new ListView<>();
		listView.setCellFactory(PropertyListCellFaytory.<Fond>textFactory(EMFProperties.value(MyfondPackage.Literals.FOND__NAME)));
		listView.setItems(AdapterFactory.<Fond>adapt(EMFProperties.list(MyfondPackage.Literals.MY_FOND__FOND_LIST).observe(datasource.getRoot())));
		listView.getSelectionModel().selectedItemProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable observable) {
				context.getParent().set(Fond.class, listView.getSelectionModel().getSelectedItem());
			}
		});
		return listView;
	}
}
