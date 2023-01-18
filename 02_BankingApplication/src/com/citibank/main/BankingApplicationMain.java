package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		System.out.println("main start");
		//object creation
		Account account = new Account();
	//	account.AccountNumber = 101;
		account.setAccountNumber(101);
		account.setName("jisha");
		account.setBalance(5000.00);
		
		account.getBalance();
		
		//function calling
		account.withdraw(200);
		account.deposit(300);
		System.out.println("main end");
		System.out.println(account.getBalance());
	
		
	}

}
