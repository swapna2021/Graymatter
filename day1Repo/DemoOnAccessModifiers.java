package com.graymatter;

public class DemoOnAccessModifiers {

	public static void main(String[] args) {
		

		DemoClass dc=new DemoClass();
		dc.name="SWAPNA";
		System.out.println(dc.name);
		DemoClass.InnerClass ic=new DemoClass().new InnerClass();
		
		ClassA ca=new ClassA();
		
	}

}
