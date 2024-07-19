package com.graymatter;

import java.util.Arrays;

public class School {
	
	String schoolname;
	String address;
	ClassRoom cr[];
	
	public School() {
		super();
	}

	public School(String schoolname, String address) {
		super();
		this.schoolname = schoolname;
		this.address = address;
		ClassRoom c1=new ClassRoom(3,2);
		ClassRoom c2=new ClassRoom(5,1);
		ClassRoom cr[]=new ClassRoom[2];
		cr[0]=c1;
		cr[1]=c2;
		this.cr=cr;
	}

	@Override
	public String toString() {
		return "School [schoolname=" + schoolname + ", address=" + address + ", cr=" + Arrays.toString(cr) + "]";
	}

}
