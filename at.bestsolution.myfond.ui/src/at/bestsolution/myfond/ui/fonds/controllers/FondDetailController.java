package at.bestsolution.myfond.ui.fonds.controllers;

import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.CURRENCY__NAME;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.FOND__ASSET_BASED_FEE;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.FOND__ID;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.FOND__MANAGEMENT_FEE;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.FOND__NAME;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.FOND__START_DATE;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.FOND__TARGET_DEFINITION;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.MY_FOND__CURRENCY_LIST;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.*;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.fx.ui.databinding.JFXUIProperties;
import org.eclipse.fx.ui.databinding.ListUtil;
import org.eclipse.fx.ui.databinding.converters.LocalDateConverter;

import at.bestsolution.myfond.datasource.Datasource;
import at.bestsolution.myfond.model.myfond.Currency;
import at.bestsolution.myfond.model.myfond.Fond;
import at.bestsolution.myfond.model.myfond.Risk;

public class FondDetailController implements Initializable {
	private WritableValue master = new WritableValue();
	
	@FXML TextField id;

	@FXML TextField name;

	@FXML TextArea description;

	@FXML DatePicker startDate;

	@FXML TextField assetFee;

	@FXML TextField managementFee;
	
	@Inject
	Datasource datasource;

	@FXML ComboBox<Currency> currency;

	@FXML ComboBox<Risk> risk;
	
	@Inject
	public void setFond(@Optional Fond fond) {
		master.setValue(fond);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		EMFDataBindingContext dbc = new EMFDataBindingContext();
		
		ListUtil.setupComboBox(EMFProperties.list(MY_FOND__CURRENCY_LIST).observe(datasource.getRoot()), currency, EMFProperties.value(CURRENCY__NAME));
		setupRiskBox();
		
		createTextBinding(id, dbc, FOND__ID);
		createTextBinding(name, dbc, FOND__NAME);
		createTextBinding(description, dbc, FOND__TARGET_DEFINITION);
		
		createDateBinding(startDate, dbc, FOND__START_DATE);
		createTextBinding(assetFee, dbc, FOND__ASSET_BASED_FEE);
		createTextBinding(managementFee, dbc, FOND__MANAGEMENT_FEE);
		
		createSelectionBinding(currency, dbc, FOND__CURRENCY);
		createSelectionBinding(risk, dbc, FOND__RISK);
		
	}
	
	private void createTextBinding(TextInputControl field, EMFDataBindingContext dbc, EStructuralFeature... featurePath) {
		dbc.bindValue(
				JFXUIProperties.text().observe(field), 
				EMFProperties.value(FeaturePath.fromList(featurePath)).observeDetail(master));
	}

	private void createDateBinding(DatePicker field, EMFDataBindingContext dbc, EStructuralFeature... featurePath) {
		dbc.bindValue(
				JFXUIProperties.date().observe(field), 
				EMFProperties.value(FeaturePath.fromList(featurePath)).observeDetail(master),
				new EMFUpdateValueStrategy().setConverter(LocalDateConverter.fromLocalDateTotoDate()),
				new EMFUpdateValueStrategy().setConverter(LocalDateConverter.fromDateToLocalDate())
				);
	}
	
	private void createSelectionBinding(ComboBox<?> field, EMFDataBindingContext dbc, EStructuralFeature... featurePath) {
		dbc.bindValue(
				JFXUIProperties.singleViewSelection().observe(field), 
				EMFProperties.value(FeaturePath.fromList(featurePath)).observeDetail(master));
	}
	
	private void setupRiskBox() {
		risk.setCellFactory(new Callback<ListView<Risk>, ListCell<Risk>>() {
			
			@Override
			public ListCell<Risk> call(ListView<Risk> param) {
				return new RiskCell();
			}
		});
		risk.setButtonCell(new RiskCell());
		risk.setItems(FXCollections.observableArrayList(Risk.values()));
	}
	
	static class RiskCell extends ListCell<Risk> {
		@Override
		protected void updateItem(Risk item, boolean empty) {
			if( item != null && ! empty ) {
				setText(item.getName());
			} else {
				setText(null);
			}
			super.updateItem(item, empty);
		}
	}
}
