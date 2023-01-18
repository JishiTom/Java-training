package com.citibank.main.factory;

import com.citibank.main.com.MyClass;
import com.citibank.main.com.MyInterface;
import com.citibank.main.com.YourClass;

public class MyFactory {

	public static MyInterface getObject(int choice) {
		if(choice ==1) {
			return new MyClass();
			}
		if (choice == 2) {
			return new YourClass();
		}
		return null;
	}
}
