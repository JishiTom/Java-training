package com.citibank.main;

import com.citibank.main.domain.Account1;
import com.citibank.main.domain.AccountThread;


public class AccountMain {
	private int choice;
	private Account1 account1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Account1 account1 = new Account1(50000);
		AccountThread accountthread = new AccountThread(2000, 1 ,account1);  
		Thread thread1 = new Thread(accountthread);
		thread1.start();
		
		AccountThread accountthread1 = new AccountThread(2000, 2 ,account1);  
		Thread thread2 = new Thread(accountthread1);
		thread2.start();
		
	//	ThreadOne threadOne = new ThreadOne();
	//	threadOne.start();
	}

}
