package com.citibank.main.domain;

public class MyClass {
	// creation of constructor
	int i;
	String address;
	
public MyClass() {
	
//	// TODO Auto-generated constructor stub
	System.out.println("Default constructor Myclass");
}
public MyClass(int i) {
	System.out.println(" interger paramater constructor");
//	i = 100;
	System.out.println("value of i" + i);
}
public MyClass( String s) {
	System.out.println(" string parameter constructor");
	//address = "avadichennai";
	System.out.println(" value of address is" + s);
}
// void show is a method/ this gives a return ... 
public void show() {
	System.out.println("hi");
}
	
}


