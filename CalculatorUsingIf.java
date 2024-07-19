package com.graymatter;

import java.util.Scanner;

public class CalculatorUsingIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		char op;
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter operator");
		op=sc.next().charAt(0);//reads one charater
		
		if(op=='+')
			System.out.println(a+b);
		else if(op=='-')
			System.out.println(a-b);
		else if (op=='*')
			System.out.println(a*b);
		else if(op=='/')
			System.out.println((float)a/b);
		else
			System.out.println("invalid operator");

	}

}
