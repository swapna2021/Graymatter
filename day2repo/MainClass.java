package com.graymatter;

public class MainClass {
	
	
	public static void main(String[] args) throws Throwable {
		
		School sc=new School("KV","Hyd");
		System.out.println(sc);
		Student s1=new Student("swapna", 123);
		Student s2=new Student("Amit",145);
		Student s3=new Student("Raj",789);
		Student st[]= {s1,s2,s3};
		ClassRoom c=new ClassRoom(7,4,st);
		System.out.println(sc);	
		System.out.println(c);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		MainClass mc=new MainClass();
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Manual invoke to finalize");
		
		
		
	}

}
