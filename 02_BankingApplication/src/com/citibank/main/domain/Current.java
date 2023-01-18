package com.citibank.main.domain;

public class Current extends Account {
private double OverdraftLimit;
private double initialOverdraftBalance;


public Current() {
	System.out.println("current account extended");
}

public Current(int accountNumber, String name, double balance, double OverdraftLimit) {
	super(accountNumber, name, balance);
	this.OverdraftLimit = OverdraftLimit;
	initialOverdraftBalance = OverdraftLimit;
}

public Current(double initialOverdraftBalance) {
	super();
	initialOverdraftBalance = OverdraftLimit;
	this.OverdraftLimit = OverdraftLimit;
	
}

public double getOverdraftLimit() {
	return OverdraftLimit;
}

public void setOverdraftlimit(double OverdraftLimit) {
	this.OverdraftLimit = OverdraftLimit;
}

	public boolean withdraw(double amount) {

	if (amount > 0)
	{if (amount <= getBalance()) 
		{setBalance(getBalance()- amount);
			return true;
			
		}
		 if ((amount > getBalance()) && (amount <=getBalance()+ OverdraftLimit)){ 
			 amount = amount - getBalance();
			 setBalance(0);
			 OverdraftLimit = OverdraftLimit - amount; 
			return true;
		}}
		
	return false;
		
	} 

	public boolean deposit(double amount) {
		if(amount > 0) {
			if (initialOverdraftBalance > OverdraftLimit)
			{
				if(amount < initialOverdraftBalance - OverdraftLimit) {
					OverdraftLimit = OverdraftLimit + amount;
					return true;
				}
				else 
				{
					amount = amount -(initialOverdraftBalance - OverdraftLimit);
					OverdraftLimit = initialOverdraftBalance;
					setBalance(getBalance()+ amount);
					return true;
				}}
				else
				{
					setBalance(getBalance()+ amount);
					return true;
				}
			}
			
		
		return false;
	
	}




		
	}


