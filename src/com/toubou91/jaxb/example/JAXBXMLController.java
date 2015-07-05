package com.toubou91.jaxb.example;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBXMLController {

	public static List<Smartphones> unmarshal(File file) throws JAXBException {
		Smartphones smartphones = new Smartphones();
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Smartphones.class);
 		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		smartphones = (Smartphones) jaxbUnmarshaller.unmarshal(file);
 		
		return smartphones.getSmartphones();
		
	}
}
