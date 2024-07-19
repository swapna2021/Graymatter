package com.graymatter;


public interface CalculatorInterface {
	
	public  void add(int a,int b);
	public  void sub(int a,int b);
	public  void mul(int a,int b);
	public  void div(int a,int b);
	public default void power(int a,int b) {
		System.out.println("calculator interface default method power");
	}
	public  default void suareRoot(int a) {
		System.out.println("calculator interface default method suareroot");
	}
	
	
	public static void getDeveloperInfo() {
		System.out.println("By Swapna");
	}
	
	
}
