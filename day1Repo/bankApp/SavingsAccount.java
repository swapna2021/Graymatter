package com.graymatter.bankApp;

public class SavingsAccount  extends Account{
	
	
	private double balance;
	
	@Override
	public void  withDraw(double amount) {
		//write code	
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", accNo=" + accNo + ", accHolderName=" + accHolderName + ", pin="
				+ pin + ", bankName=" + bankName + ", ifscCode=" + ifscCode + "]";
	}

	
	
	
}
