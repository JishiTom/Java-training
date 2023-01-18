package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		MyClass myClass = new MyClass();
		myClass.show();
		System.out.println("****************");
		//METHOD DOESNT NEED OBJECT CREATION, AS SHOWN BELOW SHOW IS THE METHOD
		new MyClass().show();
		
		System.out.println("while calling int");
		new MyClass(10);
		
		System.out.println(" while calling string");
		new MyClass("address");
		
		System.out.println("main end");
	}

}
