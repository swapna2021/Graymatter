package com.graymatter;

import java.util.Scanner;

public class DemoOnIf {

	public static void main(String[] args) {
		
//		boolean flag=false;
//		if(flag==true)
//			System.out.println("Hai");
//		else
//			System.out.println("bye");
		
		
		Scanner sc=new Scanner(System.in);
		//max of two numbers
//		int num1,num2;
//		System.out.println("Enter two numbers");
//		num1=sc.nextInt();
//		num2=sc.nextInt();
//		
//		
//		if(num1>num2)
//			System.out.println("num1 is max"+num1);
//		else
//			System.out.println("num2 is max"+num2);
		
		//check num is even or odd
//		System.out.println("enter a number to check");
//		int num=sc.nextInt();
//		if(num%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
		
		//max of 3
		int a,b,c;
		System.out.println("enter 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("a is max");
		else if(b>a && b>c)
			System.out.println("b is max");
		else
			System.out.println("c is max");

	}

}
