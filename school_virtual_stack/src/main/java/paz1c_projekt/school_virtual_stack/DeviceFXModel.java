package paz1c_projekt.school_virtual_stack;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DeviceFXModel {
	
	private Device device;
	private StringProperty nazov = new SimpleStringProperty();
	private StringProperty zodpovednaOsoba = new SimpleStringProperty();
	private StringProperty ucebna = new SimpleStringProperty();

	public DeviceFXModel(Device device) {
		this.device = device;
		device.setNazov(device.getNazov());
		device.setZodpovednaOsoba(device.getZodpovednaOsoba());
		device.setUcebna(device.getUcebna());
	}
	
	public Device getDevice() {
		device.setNazov(device.getNazov());
		device.setZodpovednaOsoba(device.getZodpovednaOsoba());
		device.setUcebna(device.getUcebna());
		return device;
	}

	// NAZOV
	public String getNazov() {
		return nazov.get();
	}
	public void setNazov(String deviceName) {
		this.nazov.set(deviceName);
	}	
	public StringProperty getNazovProperty() {
		return nazov;
	}

	// ZODPOVEDNA OSOBA
	public String getZodpovednaOsoba() {
		return zodpovednaOsoba.get();
	}
	public void setZodpovednaOsoba(String zodpovednaOsoba) {
		this.zodpovednaOsoba.set(zodpovednaOsoba);;
	}
	public StringProperty getZodpovednaOsobaProperty() {
		return zodpovednaOsoba;
	}

	// UCEBNA
	public String getUcebna() {
		return ucebna.get();
	}
	public void setUcebna(StringProperty ucebna) {
		this.ucebna = ucebna;
	}
	public StringProperty getUcebnaProperty() {
		return ucebna;
	}
}
