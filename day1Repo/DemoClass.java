package com.graymatter;

public class DemoClass {

	 public String name;//package level
	 public void printName() {
		System.out.println(name);
		InnerClass ic=new InnerClass();
		ic.innerClassName="my inner class property";
		
		
		
	}
	 
	 
	public  DemoClass() {
		 this.name="amit";
	 }
	 
	 public class InnerClass{
		
		 String innerClassName;
		 
	 }
	  
	  
	  public DemoClass createDemoClassInstance() {
		  
		  DemoClass dc=new DemoClass();
		  return dc;
	  }
}
