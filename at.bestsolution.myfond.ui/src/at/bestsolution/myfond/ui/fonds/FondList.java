package at.bestsolution.myfond.ui.fonds;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.fx.core.databinding.AdapterFactory;
import org.eclipse.fx.ui.databinding.ListUtil;
import org.eclipse.fx.ui.databinding.PropertyListCellFaytory;

import at.bestsolution.myfond.datasource.Datasource;
import at.bestsolution.myfond.model.myfond.Fond;
import at.bestsolution.myfond.model.myfond.MyfondFactory;
import at.bestsolution.myfond.model.myfond.MyfondPackage;


public class FondList {
	
	@Inject
	Datasource datasource;
	
	@Inject
	IEclipseContext context;

	private ListView<Fond> listView;
	
	@PostConstruct
	void init(BorderPane parent) {
		BorderPane p = new BorderPane();
		p.getStyleClass().add("viewContent");
		p.setCenter(createList());
		parent.setCenter(p);
		
		HBox box = new HBox(10);
		box.setPadding(new Insets(10,10,0,10));
		
		{
			Region spacer = new Region();
			HBox.setHgrow(spacer, Priority.ALWAYS);
			box.getChildren().add(spacer);
		}
		
		{
			Button b = new Button();
			b.getStyleClass().addAll("toolbutton","add");
			b.setOnAction((e) -> addEntry());
			box.getChildren().add(b);
		}
		
		{
			Button b = new Button();
			b.getStyleClass().addAll("toolbutton","remove");
			b.setOnAction((e) -> removeEntry()); 
			box.getChildren().add(b);
		}
		
		{
			Region spacer = new Region();
			HBox.setHgrow(spacer, Priority.ALWAYS);
			box.getChildren().add(spacer);
		}
		
		p.setBottom(box);
	}
	
	private void addEntry() {
		Fond fond = MyfondFactory.eINSTANCE.createFond();
		datasource.getRoot().getFondList().add(fond);
		listView.getSelectionModel().select(fond);
	}
	
	private void removeEntry() {
		datasource.getRoot().getFondList().remove(listView.getSelectionModel().getSelectedItem());
		listView.getSelectionModel().select(datasource.getRoot().getFondList().get(0));
	}
	
	private Node createList() {
		listView = new ListView<>();
//		ListUtil.setupList(listView, property);
		
		
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
