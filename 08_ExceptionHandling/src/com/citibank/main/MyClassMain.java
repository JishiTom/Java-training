package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
//		MyClass myClass;
		
		System.out.println("main start");
		
		MyClass myclass = new MyClass();
		myclass.accept();
		myclass.calculate();
		myclass.display();		
		System.out.println("main end");
		
		
	}

}
