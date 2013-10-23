package at.bestsolution.myfond.ui.main;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.fx.ui.panes.GridData;
import org.eclipse.fx.ui.panes.GridData.Alignment;
import org.eclipse.fx.ui.panes.GridLayoutPane;

public class MainScreen {
	@Inject
	EPartService partService;
	
	@Inject
	EModelService modelService;

	@PostConstruct
	void init(MApplication app, BorderPane parent) {
		GridLayoutPane layoutContainer = new GridLayoutPane();
		layoutContainer.setMarginWidth(20);
		layoutContainer.setMarginHeight(20);
		{
			Text t = new Text("My Fond");
			t.getStyleClass().add("header");
			GridData gridData = new GridData(Alignment.CENTER, Alignment.CENTER, true, false, 4, 1);
			GridLayoutPane.setConstraint(t, gridData);
			layoutContainer.getChildren().add(t);
		}
		
		{
			GridLayoutPane box = new GridLayoutPane();
			box.getStyleClass().add("contentArea");
			box.setNumColumns(4);
			box.setMakeColumnsEqualWidth(false);
			box.setHorizontalSpacing(50);

			{
				Group g = new Group();
				GridLayoutPane.setConstraint(g, new GridData(Alignment.FILL, Alignment.FILL, true, true));
				box.getChildren().add(g);
			}
			
			{
				Label l = new Label("Fonds Admin",new ImageView(getClass().getClassLoader().getResource("icons/main/kspread.png").toExternalForm()));
				l.getStyleClass().add("item");
				l.setContentDisplay(ContentDisplay.TOP);
				GridLayoutPane.setConstraint(l, new GridData(Alignment.CENTER, Alignment.CENTER, false, true));
				box.getChildren().add(l);
				l.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						partService.switchPerspective((MPerspective) modelService.find("at.bestsolution.myfond.app.perspective.fonds", app));
					}
				});
			}
			
			{
				Label l = new Label("Basic Data",new ImageView(getClass().getClassLoader().getResource("icons/main/preferences-desktop.png").toExternalForm()));
				l.setContentDisplay(ContentDisplay.TOP);
				l.getStyleClass().add("item");
				GridLayoutPane.setConstraint(l, new GridData(Alignment.CENTER, Alignment.CENTER, false, true));
				box.getChildren().add(l);	
				l.setOnMouseClicked(new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						partService.switchPerspective((MPerspective) modelService.find("at.bestsolution.myfond.app.perspective.basicdata", app));
					}
				});
			}
			
			{
				Group g = new Group();
				GridLayoutPane.setConstraint(g, new GridData(Alignment.FILL, Alignment.FILL, true, true));
				box.getChildren().add(g);
			}
			
			GridLayoutPane.setConstraint(box, new GridData(GridData.FILL_BOTH));
			layoutContainer.getChildren().add(box);
		}
		
		parent.setCenter(layoutContainer);
	}
}
