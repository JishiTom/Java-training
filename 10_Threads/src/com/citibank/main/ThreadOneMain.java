package com.citibank.main;

import com.citibank.main.domain.ThreadOne;

public class ThreadOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		ThreadOne threadOne = new ThreadOne();
		
		threadOne.start();
		
		for (int i = 0; i<1000;i++) {
		System.out.println("main " + i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println("main end");
	}

}
