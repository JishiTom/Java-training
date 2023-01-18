package com.citibank.main;

import com.citibank.main.domain.ThreadOne;
import com.citibank.main.domain.ThreadTwo;

public class ThreadThreeMain {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("main is creating child thredone");
		ThreadOne threadOne = new ThreadOne();
		threadOne.start();
		
		
		System.out.println("Main is creating Child threadTwo");
		// threadtwo is not in relation with thread class, so we need to create
		// a object of thread class as shown below
		ThreadTwo two = new ThreadTwo();
		Thread threadTwo = new Thread(two);
		threadTwo.start();
		
		System.out.println("main end");
		
}
}
;
