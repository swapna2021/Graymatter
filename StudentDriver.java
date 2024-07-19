package com.graymatter;

public class StudentDriver {

	public static void main(String[] args) {
		Student st1=new Student();
		System.out.println(st1);
		st1.setStudName("Swapna");
		st1.setId(123);
		st1.setM1(80);
		st1.setM2(90);
		st1.setM3(90);
		System.out.println(st1);// using toString()
		System.out.println("using getters");
		System.out.println(st1.getStudName());
		System.out.println(st1.getId());
		System.out.println(st1.getM1());
		System.out.println(st1.getM2());
		System.out.println(st1.getM3());
		
		Student st2=new Student("Amit",124,89,89,89);
		System.out.println(st2);
		
		Student st3=new Student("Raj",456);
		System.out.println(st3);
		

	}

}
