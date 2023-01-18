package com.citibank.main.domain;

public abstract class Account {
	private int AccountNumber;
	private String name;
	private double balance;
	
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	
	public Account() { 
			System.out.println(" Default constructor");
		}
		
	public Account(int accountNumber, String name, double balance) {
	
		AccountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
		
		
	
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract boolean withdraw(double amount);
	
////	public boolean withdraw(double amount){
////		System.out.println("withdraw called");
//		if ((amount > 0) && (amount >100))
//		{
//			balance = balance - amount;
//			System.out.println(balance);
//			return true;
//		}
//		return false;
//		
//	}
	public abstract boolean deposit(double amount);
	
//	public boolean deposit(double amount) {
//		System.out.println("deposit called");
//		if (amount >0) {
//			balance = balance + amount;
//			System.out.println(balance);
//			return true;
//		}
//		return false;
//		
//	}
	
	

}
