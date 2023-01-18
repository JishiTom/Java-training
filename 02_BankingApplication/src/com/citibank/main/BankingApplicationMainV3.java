package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// above line calls default constructor 
//		Account account = new Account();
//		one refference is created below, not the object	, this is called lazy initialization
//		we create a object only when needed	
		Account account;
		
		int accountNumber;
		double balance;
		String name;
		char choice;
		String continueChoice;
		double amount;
		
		System.out.println("enter account number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter Name");
		name = scanner.nextLine();
		System.out.println("enter balance");
		balance = scanner.nextDouble();
		
		account = new Account(accountNumber, name, balance);
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
		
		System.out.println("your accont opened successsfully");
		System.out.println("Account Number :" + account.getAccountNumber());
		System.out.println("Name :" + account.getName());
		System.out.println("Account Balance:" + account.getBalance());
		
		System.out.println();
		do {
			
		showTransactionMenu(scanner, account);
		System.out.println("do you wish to continue");
		continueChoice = scanner.next();
		}while(continueChoice.equalsIgnoreCase("yes")|| continueChoice.equalsIgnoreCase("y"));
		{
			System.out.println("Thank you");	}
		}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		char choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("1. Withdrawal");
		System.out.println("2. Deposit");
		System.out.println("3.check balance");
		System.out.println("4. Exit");
		
//		choice = scanner.nextInt();
		choice = scanner.next().charAt(0);
		switch (choice) {
		case '1':
			System.out.println("Enter amount to withdraw");
			amount = scanner.nextDouble();
			if(account.withdraw(amount))
			{
				System.out.println("withdraw successfull");
			}
			else { System.out.println("withdraw failed");}
				
			break;
		case '2':
			System.out.println("Enter amount to Deposit");
			amount = scanner.nextDouble();
			if(account.deposit(amount))
			{
				System.out.println("Deposit successfull");
			}
			else { System.out.println("Deposit failed");}
				
			break;
		case '3':
			System.out.println("Available Balance");
				System.out.println(account.getBalance());
			break;
		case '4':
			System.out.println("Thanks for visiting us");	
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
				
		}
	}
	


}
