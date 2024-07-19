package com.graymatter;

public class DemoOnWrapper {

	public static void main(String[] args) {
		
		//primitive to wrapper
		int i=67;
		Integer iObj=i;
		//wrapper to primitive
		int j=iObj.intValue();
		//string to wrapper
		String sInt="78";
		Integer i1=Integer.parseInt(sInt);
		
		//wrapper to string
		String s=i1.toString();
		
		String str="Hello";
		Object obj=str;//upcasting child ref to parent
			
		String s1=(String)obj;//downcasting,parent to child explicit conversion

	}

}
