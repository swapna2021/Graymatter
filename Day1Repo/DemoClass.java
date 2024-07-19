package com.graymatter;

public class DemoClass {

	public static void main(String[] args) {
		int num=5;
		System.out.println("num = "+num);
		boolean flag=false;
		System.out.println(flag);
		
		int num1=8,num2=3;
		System.out.println("sum= "+(num1+num2));//11
		System.out.println("Diff= "+(num1-num2));//5
		System.out.println("Prod= "+(num1*num2));//24
		System.out.println("Div= "+((float)num1/num2));//
		System.out.println("Rem= "+(num1%num2));
		
		int i=8;
		//i++;//i=i+1
		//++i;
		
		//int j=i++;//post increment,first assign then inc
		int k=++i;//pre increment,first inc,then assign
		
		int a=78,b=155,c=661;
		System.out.println("Max of Two nums:" + (a>b?a:b));
		
		int d= (a>b && a>c)?a:(b>c?b:c);
		System.out.println(d);
		
		int e= a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(e);
		
		//max of 4 numbers and 5 numbers using ternary operator
		
		//swapping numbers
		//using temporary var
		int temp=a;
		a=b;
		b=temp;
		
		//swap without temp var
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a + "  "+b);
		
		
		//swap 3 numbers without using temp
		
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.println(a +" "+b+" "+c);
		
		//Check num is even or odd
		
		System.out.println(a%2==0?"even":"odd");
		
		i=5;int j=3;
		
		System.out.println(i&j);
		System.out.println(i|j);
		
		int num3=60;
		System.out.println(num3>>3);
		
		
				
		 i=6;
		float f=i;//implicit, widening--- lower range data type to higher range
		
		float f1=5.6f;
		i=(int)f1;//explicit, narrowing,some times there might be data loss;
		

	}

}
