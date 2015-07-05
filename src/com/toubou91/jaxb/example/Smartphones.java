package com.toubou91.jaxb.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "smartphones")
public class Smartphones {

	@XmlElement(name = "smartphone", type = Smartphone.class)
	private List<Smartphones> smartphones = new ArrayList<Smartphones>();
	
	public Smartphones() {}
	
	public Smartphones(List<Smartphones> smartphones) {
		this.smartphones = smartphones;
	}
	
	public void setSmartphones(List<Smartphones> smartphones) {
		this.smartphones = smartphones;
	}
	
	public List<Smartphones> getSmartphones() {
		return smartphones;
	}
	
}
