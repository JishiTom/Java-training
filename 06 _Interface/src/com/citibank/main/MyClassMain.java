package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.com.MyClass;
import com.citibank.main.com.MyInterface;
import com.citibank.main.com.YourClass;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface myInterface;
		System.out.println(" main start");
		
		System.out.println("____________");
		MyClass myClass = new MyClass();
		myClass.show();
		
		System.out.println("____________");
		myInterface = new MyClass();
		myInterface.show();
		System.out.println("____________");
		
		System.out.println(MyInterface.message);
		System.out.println(MyClass.message);
		System.out.println(YourClass.message);
		System.out.println("_____________");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Myclass object");
		System.out.println("2. YoutClass Object");
		System.out.println("enter your choice");
		int choice = scanner.nextInt();
		
		myInterface = MyFactory.getObject(choice);
		
		if(myInterface != null) {
			myInterface.show();
		}
		else { System.out.println(" invalid choice"); }
		
		System.out.println(" Main End");
	}

}
