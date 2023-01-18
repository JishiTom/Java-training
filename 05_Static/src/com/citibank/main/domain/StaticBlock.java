package com.citibank.main.domain;

public class StaticBlock {
	public static int num1 = 20;
	
	static {
	System.out.println(" static block display");	
	}

	public static void show() {
		System.out.println(" hello");
	
	}
}
