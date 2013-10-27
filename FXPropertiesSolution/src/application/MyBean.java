package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MyBean {
	private StringProperty text = new SimpleStringProperty(this,"text");
	
	public void setText(String text) {
		this.text.set(text);
	}
	
	public String getText() {
		return this.text.get();
	}
	
	public StringProperty textProperty() {
		return this.text;
	}
}
