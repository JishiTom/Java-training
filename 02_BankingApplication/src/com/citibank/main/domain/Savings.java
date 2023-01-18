package com.citibank.main.domain;
public class Savings extends Account {
private boolean isSalary;
public Savings() {
	
	System.out.println(" savings account extended");
}

public Savings(int accountNumber, String name, double balance, boolean isSalary) {
	super(accountNumber, name, balance);
	this.isSalary = isSalary;
}

public boolean isSalary() {
	return isSalary;
}

public void setSalary(boolean isSalary) {
	this.isSalary = isSalary;
}
	public boolean withdraw(double amount)
{
	if (amount >0 && amount <= getBalance())
	{	if(isSalary ) {
		setBalance(getBalance() - amount);
		return true;
	}
	if (isSalary == false && getBalance()-amount >= 1500) {
		setBalance(getBalance()- amount);
		System.out.println("withdraw successfull for current account");
		return true;
	}
	}
	return false;

}
		public boolean deposit(double amount)
	{
		if (amount >0) {
		setBalance(getBalance()+ amount);
		System.out.println("deposit successfull");
		return true;
		}
		return false;
		
		}
	}

	


