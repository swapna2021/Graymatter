package com.graymatter;

public class DemoOnStatic {
	
	
	String name;
	
	public   void sayHello() { //static methods always uses static properties
		//static methods are class methods
		
		 
		System.out.println("Hello...."+this.name);
	}
	
	static {
		System.out.println("static block1");
	}
	
	
	static {
		System.out.println("static block4");
	}
	
	
	
	static {
		System.out.println("static block2");
	}
	
	
	static {
		System.out.println("static block3");
	}
	
	public static void main(String[] args) {
		
		System.out.println("in side main method");
		//DemoOnStatic.sayHello();
		main();
		
		DemoOnStatic ds1=new DemoOnStatic();
		DemoOnStatic ds2=new DemoOnStatic();
		DemoOnStatic ds3=new DemoOnStatic();
		//name="Swapna";
		ds1.sayHello();//swapna
		//name="swathi";
		ds2.sayHello();
		ds3.sayHello();
		
	}
	public static void main() {
		
		System.out.println("static main without argument");
		
	}
	
	
	

}
