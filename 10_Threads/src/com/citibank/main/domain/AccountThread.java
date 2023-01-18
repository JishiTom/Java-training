package com.citibank.main.domain;
import com.citibank.main.domain.Account1;

public class AccountThread implements Runnable {
	private double amount;
	private int transactionchoice;
	private Account1 account1;
	
	
	public AccountThread(double amount, int transactionchoice, Account1 account1) {
		super();
		this.amount = amount;
		this.transactionchoice = transactionchoice;
		this.account1 = account1;
	}


	@Override
	public void run() {
		
		System.out.println("call account to initiate the processing");
//		Account1 account1 = new Account1(0);
		
		if (transactionchoice == 1 ) {
		account1.withdraw(amount);
//		System.out.println("withdraw done::" account1.getbalance);
		}
		else{
			account1.deposit(amount);
//			System.out.println("withdrwa done::" account1.getbalance);
		}
			
	}

}
