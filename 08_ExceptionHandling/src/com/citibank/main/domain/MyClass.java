package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	Scanner scanner;
	Scanner scanner1;
	private double num1;
	private double num2;
	private double num3;
	private double result;
	
	public void accept() {
		//accept two numbers from user
		try{
			Scanner scanner = new Scanner(System.in);
			Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = scanner.nextInt();
		System.out.println("Enter num2");
		num2 = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input from user");
			System.out.println("program will continue execution");
			System.out.println(e.getMessage());
		
		}
		catch (Exception e) {
			System.out.println("Exception in code");
			System.out.println(e.getMessage());
		}
		finally{
			try {
				System.out.println("Enter num1");
				num3 = scanner1.nextInt();
				scanner1.nextLine();
			} catch (Exception e) {
				
			}finally {
				
			}
			System.out.println("thank you");
			scanner.close();
			
		}
		
	}
	public void calculate() {
		//calculate result = num1/num2
		result = num1 / num2;
	}
	public void display() {
		//print value of result
		System.out.println("Value of Num1:"  + num1);
		System.out.println("Value of Num2:"  + num2);
		System.out.println("Value of Result:"  + result);
	}
}
