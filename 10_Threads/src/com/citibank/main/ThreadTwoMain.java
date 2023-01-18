package com.citibank.main;

import com.citibank.main.domain.ThreadTwo;

public class ThreadTwoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwo threadTwo = new ThreadTwo();
		Thread thread = new Thread(threadTwo);
		
		thread.start();
		for (int i = 0; i<1000;i++) {
			System.out.println("Threadtwo Main display" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}

}
;