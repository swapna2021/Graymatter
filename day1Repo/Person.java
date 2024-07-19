package com.graymatter;

import java.util.Date;

public class Person {
	
	private String name;
	private int id;
	private String mobile;
	private String email;
	private Date dob;
	public Person() {
		super();
		System.out.println("from person");
	}
	public Person(String name, int id, String mobile, String email, Date dob) {
		super();
		System.out.println("from person  constructor with parameters ");
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", mobile=" + mobile + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
	

}
