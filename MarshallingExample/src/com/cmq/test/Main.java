package com.cmq.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * A exmaple of marshalling and unmarshalling
 * 
 * @author:JardenChen
 *ÏÂÎç3:53:25
 *2016
 */
public class Main {

	public static void main(String[] args) throws JAXBException {
		Emploees ems=new Emploees();
		ArrayList<Employee> list=new ArrayList<>();
		Employee e1=new Employee("cmq", "man", 14000, "engineer");
		Employee e2=new Employee("jarden", "man", 18000, "software");
		
		list.add(e1);
		list.add(e2);
		
		ems.setEe(list);
		
		marshalling(ems);
//		unmarshaling();
	}
	
	public static void marshalling(Object object) throws JAXBException{
		Emploees ems=(Emploees)object;
		JAXBContext context=JAXBContext.newInstance(Emploees.class);
		Marshaller marsh=context.createMarshaller();
		marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marsh.marshal(ems, new File("d://config.xml"));
	}
	
	public static void unmarshaling() throws JAXBException{
		JAXBContext context=JAXBContext.newInstance(Emploees.class);
		Unmarshaller unmarsh=context.createUnmarshaller();
		Emploees ems=(Emploees)unmarsh.unmarshal(new File("d://config.xml"));
		
		List<Employee> li=ems.getEe();
		li.forEach(e->System.out.println(e.toString()));
	}

}
