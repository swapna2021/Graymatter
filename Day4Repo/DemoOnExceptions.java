package com.graymatter;

public class DemoOnExceptions {
	
	public static void doDiv(int a,int b)  {
		if(b==0)
			throw new RuntimeException();
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
//		int nume=7,deno[]= {1,4,6,2};
//		String s=null;
//		try {
//			for(int i=0;i<deno.length;i++)
//				if(deno[i]==0)
//					throw new ArithmeticException();
//				else
//				System.out.println(nume/deno[i]);
//			System.out.println(s.charAt(0));
//			
//		}
//		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
//			ae.printStackTrace();
//		}
////		catch(ArrayIndexOutOfBoundsException e) {
////			e.printStackTrace();
////		}
//		finally {
//			System.out.println("finally block reached");
//		}
		
		try {
		doDiv(5,0);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("End of main block");
		
	}

}
