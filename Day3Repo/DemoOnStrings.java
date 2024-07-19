package com.graymatter;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class DemoOnStrings {
	
	public static void main(String[] args) {
		
		
		String str=new String("Hello");
		System.out.println(str.hashCode());
		str="Hello ";
		System.out.println(str.hashCode());
		
		String s1=new String("Hello");
		System.out.println(s1.hashCode());
		
		String s2="Hello";
		System.out.println(s2.hashCode());
		
		
		System.out.println(s2.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		String s=s2;
		System.out.println(s.hashCode());
		s2=s2+"world";
		System.out.println(s2);
		
		System.out.println(s1.equals(s));
		
		s="     Hello     ";
		System.out.println(s.length());
		System.out.println(s.trim().length());
		 s1="Hello";
		 s=s.replace('H', 'c');
		 System.out.println(s);
		 
		 s="Apple";
		 s1="apple";
		 System.out.println(s1.compareTo(s));
		 
		 System.out.println(s.endsWith("lo"));
		
		 
		 StringBuffer sbf=new StringBuffer(50);
		 System.out.println(sbf.capacity());
		 StringBuffer sbf1=new StringBuffer("hello ");
		 System.out.println(sbf.hashCode());
		 System.out.println(sbf1.hashCode());
		 System.out.println(sbf);
		 sbf.append("swapna");
		 System.out.println(sbf);
		 System.out.println(sbf.hashCode());
		 s=sbf.toString();
		 
		 String strArr[]= {"swapna","amit","swathi","Pooja"};
		 for(String sr:strArr)
			 if(sr.charAt(0)=='s')
				 System.out.println(sr);
		 
		 String para="hello this is Graymatter company";
		 String sarr[]=para.split(" ");
		 for(String sr:sarr)
		 System.out.println(sr);
		 
		 String joiner="";
		 for( String sr:sarr)
			 joiner=joiner+sr+" ";
		 System.out.println(joiner);
		 
		 StringTokenizer tokenizer=new StringTokenizer(para," ");
		 while(tokenizer.hasMoreTokens())
			 System.out.println(tokenizer.nextToken());
		 
		 
		 //joiner 
		 StringJoiner sjoiner=new StringJoiner(",");
		 sjoiner.add("apple");
		 sjoiner.add("ball");
		 sjoiner.add("apple");
		 sjoiner.add("ball");
		 sjoiner.add("apple");
		 sjoiner.add("ball");
		 System.out.println(sjoiner);
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
	}

}
