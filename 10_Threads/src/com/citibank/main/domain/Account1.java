package com.citibank.main.domain;

public class Account1 {
	private double balance;

	public Account1(double balance) {
		super();
		this.balance = balance;
	}
	


		public synchronized boolean withdraw(double amount){
		System.out.println("withdraw called");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if ((amount > 0) && (amount >100))
	{
			balance = balance - amount;
			System.out.println("amount post withdraw:: " + balance);
			return true;
			
		}
		return false;
		
	}
	
	
	public synchronized boolean deposit(double amount) {
		System.out.println("deposit called");
	if (amount >0) {
			balance = balance + amount;
			System.out.println("amount post deposit:: " + balance);
			return true;
		}
		return false;
		
		
	}
	
}
