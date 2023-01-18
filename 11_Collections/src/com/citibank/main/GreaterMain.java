package com.citibank.main;

import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreaterMain {

	public static void main(String[] args) {
		Greeter greeter = new GoodMorningGreeter();
		greeter.great();
		
		//anonymous class//	
		Greeter greater1 = new Greeter() {
			
			@Override
		public void great() {
			System.out.println("Good evening Java");
			
		}
		
		};
		greater1.great();
		System.out.println("______________");
		
		Greeter greeter2 = () -> {
			System.out.println("my way");
		};
//		GoodMorningGreeter greeter2 = null;
		greeter2.great();
		System.out.println("______________");

		Greeter goodNightGreeter = () -> {System.out.println("Good Night");};
		goodNightGreeter.great();
		System.out.println("______________");
		
		Runnable runnable = () -> System.out.println("we are in a thread");
		Thread thread = new Thread(runnable);
		
		thread.start();
		System.out.println("______________");
		
		Thread thread2 = new Thread( () -> System.out.println("we are in thread"));
		thread2.start();
		
		System.out.println("______________");
		new Thread(() -> System.out.println("we are in thread")).start();;
		
		new Thread(() -> {
			for (int i = 0; i<10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("thread is running");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
	}
	
	
}
		

	


