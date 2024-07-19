package com.graymatter;

import java.util.Scanner;
//Prog to check number is prime or not
public class CheckPrime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//System.err.println("error message");
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int i=2;
		boolean flag=true;
		while(i<=Math.sqrt(num)) {
			if(num%i==0) {
				flag=false;
				break;
			
			}
		i++;		
	}
	if(flag)
		System.out.println("prime");
	else
		System.out.println("not ");
		
	}	

}
