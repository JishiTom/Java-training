package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Savings savings;
		boolean isSalary = false;
		
		int accountNumber;
		String sal;
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
		scanner.nextLine();
		System.out.println(" do you want a salary account? enter Y or N");
		sal = scanner.next();
		
		if (sal.equals("yes")){
			isSalary = true;
			System.out.println(" Salary account selected");
		}
		
		savings = new Savings(accountNumber, name, balance, isSalary);
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
		
		System.out.println("your current account opened successsfully");
		System.out.println("Account Number :" + savings.getAccountNumber());
		System.out.println("Name :" + savings.getName());
		System.out.println("Account Balance:" + savings.getBalance());
		
		System.out.println();
		
		do {
			
		showTransactionMenu(scanner, savings);
		System.out.println("do you wish to continue");
		continueChoice = scanner.next();
		}while(continueChoice.equalsIgnoreCase("yes")|| continueChoice.equalsIgnoreCase("y"));
		{
			System.out.println("Thank you");	}
		}

	private static void showTransactionMenu(Scanner scanner, Savings savings) {
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
			if(savings.withdraw(amount))
			{
				System.out.println("withdraw successfull");
			}
			else { System.out.println("withdraw failed");}
				
			break;
		case '2':
			System.out.println("Enter amount to Deposit");
			amount = scanner.nextDouble();
			if(savings.deposit(amount))
			{
				System.out.println("Deposit successfull");
			}
			else { System.out.println("Deposit failed");}
				
			break;
		case '3':
			System.out.println("Available Balance");
				System.out.println(savings.getBalance());
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


