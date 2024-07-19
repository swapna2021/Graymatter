package com.graymatter;

import java.util.Scanner;

//class name Employee
//POJO--- plain old java object
public class Employee {
	
	
	//properties,instance variables;
	String name;
	int id;
	double sal;
	String mobile;
	String email;
	
	//default constructor
	
	
	
	
	
	public Employee(String name, int id, double sal, String mobile, String email) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.mobile = mobile;
		this.email = email;
	}




	public Employee() {
		super();
	}




	//static String companyName;//static variables
	
	public void setDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee details,name,id,sal,mobile,email");
		this.name=sc.next();
		this.id=sc.nextInt();
		this.sal=sc.nextDouble();
		this.mobile=sc.next();
		this.email=sc.next();
	}
	
	public void getDetails() {
		System.out.println(this.name+" "+this.id+" "+
		this.sal+" "+this.mobile+" "+this.email);
		
		
	}

}
