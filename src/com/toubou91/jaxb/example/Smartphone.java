package com.toubou91.jaxb.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "smartphone")
public class Smartphone {

	private String make;
	private String model;
	private String androidVersion;
	
	// Getters and setters.
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAndroidVersion() {
		return androidVersion;
	}
	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}
	
	@Override
	public String toString() {
		return "Smartphone [make: " + getMake() + ", model: " + getModel() + ", android version: "
					+ getAndroidVersion() + "]" ;
	}
}
