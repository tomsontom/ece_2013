package at.bestsolution.myfond.ui.fonds.controllers;

import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.*;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javax.inject.Inject;

import org.eclipse.core.databinding.ObservablesManager;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.fx.ui.databinding.JFXUIProperties;
import org.eclipse.fx.ui.databinding.ListUtil;

import at.bestsolution.myfond.datasource.Datasource;
import at.bestsolution.myfond.model.myfond.Currency;
import at.bestsolution.myfond.model.myfond.CurrencyDistribution;

public class CurrencyDialogController implements Initializable {

	@FXML ComboBox<Currency> currency;
	@FXML TextField percentage;
	
	@Inject
	CurrencyDistribution distribution;

	@Inject
	Datasource datasource;
	private EMFDataBindingContext dbc;
	private ObservablesManager mgr;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ListUtil.setupComboBox(EMFProperties.list(MY_FOND__CURRENCY_LIST).observe(datasource.getRoot()), currency, EMFProperties.value(CURRENCY__NAME));
		
		dbc = new EMFDataBindingContext();
		mgr = new ObservablesManager();
		mgr.runAndCollect(new Runnable() {
			
			@Override
			public void run() {
				{
					IObservableValue uiObs = JFXUIProperties.singleViewSelection().observe(currency);
					IObservableValue mObs = EMFProperties.value(CURRENCY_DISTRIBUTION__CURRENCY).observe(distribution);
					dbc.bindValue(uiObs, mObs);
				}
				
				{
					IObservableValue uiObs = JFXUIProperties.text().observe(percentage);
					IObservableValue mObs = EMFProperties.value(CURRENCY_DISTRIBUTION__PERCENTAGE).observe(distribution);
					dbc.bindValue(uiObs, mObs);
				}				
			}
		});
	}

	@FXML public void onClose() {
		mgr.dispose();
		currency.getScene().getWindow().hide();
	}

}
