package com.graymatter;

import java.util.Date;

public class Employee extends Person{
	
	private String deptName;
	private double salary;
	private Date doj;
	public Employee() {
		
	}
	public Employee(String name, int id, String mobile, String email, Date dob, String deptName, double salary,
			Date doj) {
		super(name, id, mobile, email, dob);
		this.deptName = deptName;
		this.salary = salary;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", salary=" + salary + ", doj=" + doj + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	

}
