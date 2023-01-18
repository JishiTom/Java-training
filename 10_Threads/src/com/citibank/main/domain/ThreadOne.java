package com.citibank.main.domain;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" we are in ThreadOne");
		for (int i = 0; i<1000;i++) {
			System.out.println("Thread one display" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	}

