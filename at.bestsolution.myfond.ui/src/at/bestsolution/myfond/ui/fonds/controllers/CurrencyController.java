package at.bestsolution.myfond.ui.fonds.controllers;

import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.CURRENCY_DISTRIBUTION__CURRENCY;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.CURRENCY_DISTRIBUTION__PERCENTAGE;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.CURRENCY__NAME;
import static at.bestsolution.myfond.model.myfond.MyfondPackage.Literals.FOND__CURRENCY_DISTRIBUTION_LIST;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javax.inject.Inject;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.fx.core.databinding.AdapterFactory;
import org.eclipse.fx.ui.databinding.TableUtil;

import at.bestsolution.myfond.model.myfond.CurrencyDistribution;
import at.bestsolution.myfond.model.myfond.Fond;

public class CurrencyController implements Initializable {
	private WritableValue master = new WritableValue();
	@FXML TableView<CurrencyDistribution> table;
	@FXML TableColumn<CurrencyDistribution,CurrencyDistribution> name;
	@FXML TableColumn<CurrencyDistribution,CurrencyDistribution> value;
	
	@Inject
	public void setFond(@Optional Fond fond) {
		master.setValue(fond);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TableUtil.setupColumn(name, "{0}", EMFProperties.value(FeaturePath.fromList(CURRENCY_DISTRIBUTION__CURRENCY,CURRENCY__NAME)));
		TableUtil.setupColumn(value, "{0,number,#,##0.00}", EMFProperties.value(FeaturePath.fromList(CURRENCY_DISTRIBUTION__PERCENTAGE)));
//		Callback<TableColumn<CurrencyDistribution,CurrencyDistribution>, TableCell<CurrencyDistribution,CurrencyDistribution>> cb = value.getCellFactory();
//		value.setCellFactory(new Callback<TableColumn<CurrencyDistribution,CurrencyDistribution>, TableCell<CurrencyDistribution,CurrencyDistribution>>() {
//			
//			@Override
//			public TableCell<CurrencyDistribution, CurrencyDistribution> call(
//					TableColumn<CurrencyDistribution, CurrencyDistribution> param) {
//				TableCell<CurrencyDistribution, CurrencyDistribution> c = cb.call(param);
//				return c;
//			}
//		});
		table.setItems(AdapterFactory.<CurrencyDistribution>adapt(EMFProperties.list(FOND__CURRENCY_DISTRIBUTION_LIST).observeDetail(master)));
	}
}
