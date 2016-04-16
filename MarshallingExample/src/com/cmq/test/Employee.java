package com.cmq.test;

import javax.xml.bind.annotation.XmlRootElement;

//you must define the root element use the annotation
@XmlRootElement(name="employee")
public class Employee {

	private String name;
	private String sex;
	private int salary;
	private String job;
	
	public Employee(){
		
	}
	public Employee(String name ,String sex ,int salary ,String job){
		this.name=name;
		this.sex=sex;
		this.salary=salary;
		this.job=job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public String toString(){
		return "Employee=["+"name="+name
				+"/sex="+sex
				+"/salary="+salary
				+"/job="+job+"]";
	}
	
}
