package com.citibank.main;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 2;
		
		int [] number = new int[5];
		
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		number[4] = 50;
	// this is self assigning the value for i with index	, we are not giving any value
	//anywhere
		for (int i : number) {
			System.out.println(i);
			i = i + 1;
			System.out.println(i);
		}
		System.out.println("_________");
		
		for (int i :number) {
			System.out.println(i);
		}
	}

}
