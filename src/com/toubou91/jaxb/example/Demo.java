package com.toubou91.jaxb.example;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBException;

public class Demo {

	public static void main(String[] args) {

		List<Smartphones> smartphones = null;
		
		try {
			smartphones = JAXBXMLController.unmarshal(new File("src/smartphones.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		System.out.println(smartphones);
	}
}
