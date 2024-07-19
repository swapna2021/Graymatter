package com.graymatter;

public  class FinalClass { //final classes can't be extended
	
	private final String name;//constants 
	protected String companyName;
	
	public void changeName(String name) {
		
		//this.name=name; final properties can not be reassigned
		
	}
	
	public final void printCompanyDetails() {//final methods can't be overridden
		System.out.println(this.companyName);
	}
	
	public FinalClass(String name) {
		this.name=name;
	}

	public FinalClass() {
		this.name="raj";
	}
	
	
	public static void display() {
		System.out.println("static method of parent class");
	}
	

}
