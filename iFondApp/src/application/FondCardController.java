package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.text.Text;

import org.eclipse.fx.ui.mobile.Card;
import org.eclipse.fx.ui.mobile.Deck;
import org.eclipse.fx.ui.mobile.TransitionType;

import application.model.DistributionValue;
import application.model.Fond;

public class FondCardController {

	@FXML Deck diagrammDeck;
	
	@FXML Card currency;
	@FXML Card asset;
	@FXML Card country;
	@FXML Card sector;
	
	@FXML Label risk;
	@FXML Label assetFee;
	@FXML Label managementFee;
	@FXML Text description;
	@FXML TitledPane fontData;

	@FXML public void showCurrency() {
		diagrammDeck.moveTo("currency", TransitionType.SLIDE_RIGHT);
	}

	@FXML public void showAsset() {
		diagrammDeck.moveTo("asset", TransitionType.SLIDE_RIGHT);
	}

	@FXML public void showCountry() {
		diagrammDeck.moveTo("country", TransitionType.SLIDE_RIGHT);
	}

	@FXML public void showSector() {
		diagrammDeck.moveTo("sector", TransitionType.SLIDE_RIGHT);
	}

	public void setFond(Fond fond) {
		fontData.textProperty().bind(fond.nameProperty());
		risk.textProperty().bind(fond.riskProperty());
		assetFee.textProperty().bind(fond.assetFeeProperty().asString());
		managementFee.textProperty().bind(fond.managementFeeProperty().asString());
		description.textProperty().bind(fond.descriptionProperty());
		
		setupChart(fond.getCurrencyDistribution(), currency);
		setupChart(fond.getCountryDistribution(), country);
		setupChart(fond.getAssetDistribution(), asset);
		setupChart(fond.getSectorDistribution(), sector);
	}

	private void setupChart(ObservableList<? extends DistributionValue> list, Card target) {
		{
			ObservableList<XYChart.Series<String, Number>> data = FXCollections.observableArrayList();
			for( DistributionValue v : list ) {
				data.add(createSeries(v));
			}
			
			final CategoryAxis xAxis = new CategoryAxis();
	        final NumberAxis yAxis = new NumberAxis();
			BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);
			chart.getData().addAll(data);
			
			((TitledPane)target.getCenter()).setContent(chart);	
		}
	}
	
	private XYChart.Series<String, Number> createSeries(DistributionValue v) {
		XYChart.Series<String, Number> series = new XYChart.Series<>();
		series.setName(v.getName());
		Data<String, Number> data = new Data<>();
		data.setXValue("");
		data.YValueProperty().bind(v.percentageProperty().asObject());
		series.getData().add(data);
		
		return series;
	}
}
