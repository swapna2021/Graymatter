package com.graymatter;

public class Main {

	public static void main(String[] args) {
		
		
//		ScientificCalculator sc=new ScientificCalculator();
//		sc.power(6, 3);
//		
//		AritmeticCalculator ac=new ScientificCalculator();
//		ac.power(7, 8);
		
		
//		Shape s=new Shape();
//		s.getArea();
//		s.getPerimeter();
//		
//		
//		Square sq=new Square(4);
//		sq.getArea();
//		sq.getPerimeter();
//		
//		
//		Circle c=new Circle(7);
//		c.getArea();
//		c.getPerimeter();
//		
//		
//		Shape s1=new Square(6);
//		s1.getArea();
//		
//		s1=new Circle(14);
//		s1.getArea();
		
		
//		CalculatorInterface ci=new MyCalculator();
//		ci.add(5, 7);
//		
//		MyScientificCalculatorInterface msi=new MyCalculator();
//		msi.power(4, 5);
//		
//		
//		MyCalculator mc=new MyCalculator();
//		mc.add(7, 8);
//		mc.suareRoot(441);
		
		
		MyClass mc=new MyClass();
		mc.display();
		
		Interface1 i1=mc;
		i1.display();
		
		Interface2 i2=mc;
		i2.display();
		
		CalculatorInterface.getDeveloperInfo();
		//CalculatorInterface ci=new MyCalculator();
		//mc.getDeveloperInfo();//not possible
	}

}
