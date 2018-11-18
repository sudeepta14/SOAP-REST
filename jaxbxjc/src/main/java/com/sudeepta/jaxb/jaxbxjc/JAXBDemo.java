package com.sudeepta.jaxb.jaxbxjc;
import Patient;
import javax.xml.bind.JAXBContext;


public class JAXBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JAXBContext context = JAXBContext.newInstance(Patient.class);
		Marshaller marshaller = context.createMarshaller();
		
		Patient patient = new Patient();
		patient.setID(123);
		patient.setName("Sudeepta");
		StringWriter writer = new StringWriter();
		
		marshaller.marshal(patient, writer);
		System.out.println(writer.toString());
	}

}
