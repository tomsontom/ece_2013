package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.fx.ui.databinding.JFXUIProperties;
import org.eclipse.fx.ui.databinding.ListUtil;

import at.bestsolution.myfond.model.myfond.Currency;
import at.bestsolution.myfond.model.myfond.MyfondFactory;
import at.bestsolution.myfond.model.myfond.MyfondPackage;

public class CurrencyController implements Initializable {

	@FXML ListView<Currency> currencyList;
	@FXML TextField nameField;
	@FXML TextField abbreviationField;
	
	private IObservableValue master = new WritableValue();
	
	@FXML public void addCurrency() {
		Currency c = MyfondFactory.eINSTANCE.createCurrency();
		c.setName("<New Currency>");
		currencyList.getItems().add(c);
	}
	@FXML public void removeCurrency() {}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		currencyList.setCellFactory((param) -> new CurrencyCell());
		
		{
			IValueProperty mProp = EMFProperties.value(MyfondPackage.Literals.CURRENCY__NAME);
			ListUtil.setupList(currencyList, mProp);
		}
		
		EMFDataBindingContext dbc = new EMFDataBindingContext();
		
		
		{
			IValueProperty mProp = EMFProperties.value(MyfondPackage.Literals.CURRENCY__NAME);
			IValueProperty uiProp = JFXUIProperties.text();

			IObservableValue mObs = mProp.observeDetail(master);
			IObservableValue uiObs = uiProp.observe(nameField);
			
			dbc.bindValue(uiObs, mObs);
		}
		
		{
			IValueProperty mProp = EMFProperties.value(MyfondPackage.Literals.CURRENCY__SYMBOL);
			IValueProperty uiProp = JFXUIProperties.text();

			IObservableValue mObs = mProp.observeDetail(master);
			IObservableValue uiObs = uiProp.observe(abbreviationField);
			
			dbc.bindValue(uiObs, mObs);
		}
		
		currencyList.getSelectionModel().selectedItemProperty().addListener((o) -> master.setValue(currencyList.getSelectionModel().getSelectedItem()));
	}
	
	static class CurrencyCell extends ListCell<Currency> {
		@Override
		protected void updateItem(Currency item, boolean empty) {
			if( item != null && ! empty ) {
				setText(item.getName());
			} else {
				setText(null);
			}
			super.updateItem(item, empty);
		}
	}
}
