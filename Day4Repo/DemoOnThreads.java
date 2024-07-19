package com.graymatter;

public class DemoOnThreads extends Thread{

	@Override
	public void run() {
		System.out.println("in run method");
//		System.out.println(currentThread().getName());
//		System.out.println(currentThread().getId());
		
		
			for(int i=1;i<=5;i++) {
//				System.out.println(currentThread().getName());
//				System.out.println(currentThread().getId());
				System.out.println(currentThread().getId()+"  "+i);
			}
		
	}
	
	public static void main(String[] args) {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(currentThread().isAlive());
		System.out.println(currentThread().isDaemon());
		DemoOnThreads dot=new DemoOnThreads();
		DemoOnThreads dot1=new DemoOnThreads();
		dot.start();
		dot1.start();
		
	}

}
