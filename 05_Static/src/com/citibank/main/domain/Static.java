package com.citibank.main.domain;

public class Static {
static int num2 =10;
int num1 =10;
final int max = 500;
	
public  void display() {
//	int num1 =10;
	
	System.out.println("value of num1 " +  num1);
	System.out.println("value of num2 " + num2);
	num1 = num1 + 10;
	num2 = num2 + 10;
	
	System.out.println("value of num1 " + num1);
	System.out.println("value of num2 "+ num2);
	System.out.println("****************");
}
}
