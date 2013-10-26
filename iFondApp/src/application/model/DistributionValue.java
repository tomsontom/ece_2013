package application.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class DistributionValue {
	private StringProperty name = new SimpleStringProperty(this,"name");
	private DoubleProperty percentage = new SimpleDoubleProperty(this, "percentage");
	
	public void setName(String name) {
		this.name.set(name);
	}
	
	public String getName() {
		return this.name.get();
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public void setPercentage(double percentage) {
		this.percentage.set(percentage);
	}
	
	public double getPercentage() {
		return this.percentage.get();
	}
	
	public DoubleProperty percentageProperty() {
		return this.percentage;
	}
}
