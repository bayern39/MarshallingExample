package com.cmq.test;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="employees")
public class Emploees {

	private ArrayList<Employee> ee=new ArrayList<>();

	public ArrayList<Employee> getEe() {
		return ee;
	}

	public void setEe(ArrayList<Employee> ee) {
		this.ee = ee;
	}
	
	public void add(Employee em){
		ee.add(em);
	}
	
	public void remove(Employee em){
		ee.remove(em);
	}
	
	
}
