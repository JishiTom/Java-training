package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to XYZ BANK");

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter account number");
		int AccountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter Name");
		String name = scanner.nextLine();
		System.out.println("enter balance");
		double balance = scanner.nextDouble();
		Account account = new Account();
		account.setAccountNumber(AccountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("your accont opened successsfully");
		System.out.println("Account Number :" + account.getAccountNumber());
		System.out.println("Name :" + account.getName());
		System.out.println("Account Balance:" + account.getBalance());

	}

}
