package at.bestsolution.myfond.ui.fonds.controllers;

import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import javax.inject.Inject;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.fx.core.databinding.AdapterFactory;
import org.eclipse.fx.ui.databinding.TableUtil;
import org.eclipse.fx.ui.di.FXMLLoader;
import org.eclipse.fx.ui.di.FXMLLoaderFactory;

import at.bestsolution.myfond.model.myfond.AssetDistribution;
import at.bestsolution.myfond.model.myfond.Fond;
import at.bestsolution.myfond.model.myfond.MyfondFactory;

public class AssetController implements Initializable {
	private WritableValue master = new WritableValue();
	
	@Inject
	@FXMLLoader
	FXMLLoaderFactory factory;
	
	@FXML TableView<AssetDistribution> table;
	@FXML TableColumn<AssetDistribution,AssetDistribution> name;
	@FXML TableColumn<AssetDistribution,AssetDistribution> value;
	
	@Inject
	IEclipseContext context;
	
	@Inject
	public void setFond(@Optional Fond fond) {
		master.setValue(fond);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TableUtil.setupColumn(name, "{0}", EMFProperties.value(FeaturePath.fromList(ASSET_DISTRIBUTION__ASSET, ASSET__NAME)));
		TableUtil.setupColumn(value, "{0,number,#,##0.00}", EMFProperties.value(ASSET_DISTRIBUTION__PERCENTAGE));
		table.setItems(AdapterFactory.<AssetDistribution>adapt(EMFProperties.list(FOND__ASSET_DISTRIBUTION_LIST).observeDetail(master)));
		table.getSelectionModel().selectedItemProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable observable) {
				context.set(AssetDistribution.class, table.getSelectionModel().getSelectedItem());
			}
		});
	}

	@FXML public void onAdd() {
		Fond f = (Fond) master.getValue();
		AssetDistribution c = MyfondFactory.eINSTANCE.createAssetDistribution();
		f.getAssetDistributionList().add(c);
		table.getSelectionModel().select(c);
		onEdit();
	}

	@FXML public void onEdit() {
		Stage s = new Stage(StageStyle.TRANSPARENT);
		
		Window window = table.getScene().getWindow();
		s.initOwner(window);
		
		double cx = window.getX() + (window.getWidth() / 2);
		double cy = window.getY() + (window.getHeight() / 2);
		
		s.setX(cx-100);
		s.setY(cy-100);
		
		try {
			Parent root = (Parent) factory.loadBundleRelative("/at/bestsolution/myfond/ui/fonds/AssetDialog.fxml").load();
			Scene sc = new Scene(root,400,-1);
			sc.setFill(Color.TRANSPARENT);
			sc.getStylesheets().addAll(window.getScene().getStylesheets());
			s.setScene(sc);
			s.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML public void onRemove() {
		Fond f = (Fond) master.getValue();
		f.getAssetDistributionList().remove(table.getSelectionModel().getSelectedItem());
		table.getSelectionModel().select(f.getAssetDistributionList().get(0));
	}
}
