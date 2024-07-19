package com.graymatter;

public class DemoOnOverloading {
	
	//change on type of parameters
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(float f1,float f2) {
		System.out.println(f1+f2);
	}
	
	public void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
	
	
	//change on number of parameters
	public void add(int a,int b,int c ) {
		System.out.println(a+b+c);
		
	}
	
	public void add(double d1,double d2,double d3,double d4) {
		System.out.println(d1+d2+d3+d4);
	}
	
	
	//change on order of parameters
	
	public void add(int a,double d) {
		System.out.println(a+d);
	}
	
	public void add(double d,int a) {
		System.out.println(d+a);
	}
	
	
	public void add(Complex c1,Complex c2) {
		Complex c3=new Complex();
		c3.imag=c1.imag+c2.imag;
		c3.real=c1.real+c2.real;
		System.out.println(c3.real+"+i"+c3.imag);
	}
	

	public static void main(String[] args) {
		
		
		DemoOnOverloading doo=new DemoOnOverloading();
		doo.add(34, 56);
		doo.add(4.5f, 5.6f);
		doo.add(4.5, 6.7,8.9,3.4);
		doo.add("Hello","world");
		Complex c1=new Complex(3,4);
		Complex c2=new Complex(5,7);
		doo.add(c1, c2);
		
		
	}

}
