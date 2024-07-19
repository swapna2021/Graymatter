package com.graymatter;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee emp=new Employee();//object
		//new Employee()---jvm invokes a default constructor
		//constructor is a special method used to create object space at runtime on heap mem
		
		emp.setDetails();
		emp.getDetails();
		
		Employee emp1=new Employee("Amit",145, 70000,"89898989","amit@gmail.com");
		emp1.getDetails();

	}

}
