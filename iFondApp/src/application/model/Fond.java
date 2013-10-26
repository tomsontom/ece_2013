package application.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Fond {
	private StringProperty id = new SimpleStringProperty(this,"id");
	private StringProperty name = new SimpleStringProperty(this,"name");
	private StringProperty risk = new SimpleStringProperty(this,"risk");
	private DoubleProperty assetFee = new SimpleDoubleProperty(this, "assetFee");
	private DoubleProperty managementFee = new SimpleDoubleProperty(this, "managementFee");
	private StringProperty description = new SimpleStringProperty(this,"description");
	
	private ObservableList<CurrencyDistributionValue> currencyDistribution = FXCollections.observableArrayList();
	private ObservableList<AssetDistributionValue> assetDistribution = FXCollections.observableArrayList();
	private ObservableList<CountryDistributionValue> countryDistribution = FXCollections.observableArrayList();
	private ObservableList<SectorDistributionValue> sectorDistribution = FXCollections.observableArrayList();
	
	public void setId(String id) {
		this.id.set(id);
	}
	
	public String getId() {
		return this.id.get();
	}
	
	public StringProperty idProperty() {
		return id;
	}
	
	public void setName(String name) {
		this.name.set(name);
	}
	
	public String getName() {
		return this.name.get();
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public void setRisk(String risk) {
		this.risk.set(risk);
	}
	
	public String getRisk() {
		return this.risk.get();
	}
	
	public StringProperty riskProperty() {
		return this.risk;
	}
	
	public void setAssetFee(double assetFee) {
		this.assetFee.set(assetFee);
	}
	
	public double getAssetFee() {
		return this.assetFee.get();
	}
	
	public DoubleProperty assetFeeProperty() {
		return assetFee;
	}
	
	public void setManagementFee(double managementFee) {
		this.managementFee.set(managementFee);
	}
	
	public double getManagementFee() {
		return this.managementFee.get();
	}
	
	public DoubleProperty managementFeeProperty() {
		return managementFee;
	}
	
	public void setDescription(String description) {
		this.description.set(description);
	}
	
	public String getDescription() {
		return this.description.get();
	}
	
	public StringProperty descriptionProperty() {
		return this.description;
	}
	
	public ObservableList<AssetDistributionValue> getAssetDistribution() {
		return assetDistribution;
	}
	
	public ObservableList<CountryDistributionValue> getCountryDistribution() {
		return countryDistribution;
	}
	
	public ObservableList<CurrencyDistributionValue> getCurrencyDistribution() {
		return currencyDistribution;
	}
	
	public ObservableList<SectorDistributionValue> getSectorDistribution() {
		return sectorDistribution;
	}
}
