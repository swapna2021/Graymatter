package com.graymatter;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		System.out.println(emp);
		Employee emp1=new Employee("Swapna",234,"9090909090","swapna@gmail.com",
				new Date("23/7/82"),"accounts",50000,new Date("23/7/2020"));
		System.out.println(emp1);
		
		
		System.out.println(emp1 instanceof Person);
		
		//complete for customer
		
		
		ClassA ca=new ClassA();
		ca.name="amit";
		
		

	}

}
