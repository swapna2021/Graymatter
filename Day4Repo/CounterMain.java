package com.graymatter;

public class CounterMain  extends Thread{
	
	CounterClass cc;
	public CounterMain() {
		super();
	}

	public CounterMain(CounterClass cc) {
		super();
		this.cc = cc;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			cc.updateCount();
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CounterClass cc=new CounterClass();
		CounterMain cm1=new CounterMain(cc);
		CounterMain cm2=new CounterMain(cc);
		
		cm1.start();
		cm2.start();
		
		

	}

}
