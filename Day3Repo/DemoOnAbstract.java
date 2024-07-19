package com.graymatter;

public class DemoOnAbstract {

	public static void main(String[] args) {
		
		
		//AbstractClass ac=new AbstractClass(); abstract classes do not have instances
		AbstractChildClass acc=new AbstractChildClass();
		acc.sayHello();
		System.out.println(acc.printName("Poojitha"));
	}

}
