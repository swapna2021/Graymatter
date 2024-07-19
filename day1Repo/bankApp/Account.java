package com.graymatter.bankApp;

public class Account {
	
	protected String accNo;
	protected String accHolderName;
	protected int pin;
	protected String bankName;
	protected String ifscCode;
	public Account() {
		super();
	}
	public Account(String accNo, String accHolderName, int pin, String bankName, String ifscCode) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.pin = pin;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", pin=" + pin + ", bankName="
				+ bankName + ", ifscCode=" + ifscCode + "]";
	}
	
	
	public void changePin(int curPin,int newPin) {
		if(this.pin==curPin)
			this.pin=newPin;
		else
			System.out.println("Pin num not matching");
	}
	
	public void withDraw(double amount)
	
	{
		System.out.println("amount withDrawn Successfully");
	}
	
	

}
