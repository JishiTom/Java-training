package com.ciitbank.main;

import com.ciitbank.main.domain.CalculationsInterface;

public class CalculationsMain {

	public static void main(String[] args) {
		int add;
		double subtract;
		double multiply;
		double division;
//		CalculationsInterface calculationInterface2;
		//addition
		CalculationsInterface calculationInterface = new CalculationsInterface() {

			@Override
			public double docalculation(double number1, double number2) {
				return number1 + number2; 
			}
			
		};
		double result = calculationInterface.docalculation(10, 20);
		System.out.println("addition of number is" + result);
		
		System.out.println("___________________________");
		
		calculationInterface = (n1 , n2) -> n1 + n2;
		System.out.println("Result" + calculationInterface.docalculation(10, 20));
		
		System.out.println("___________________________");
		
		
		CalculationsInterface calculationInterface2 = (n1, n2) -> {
			double res = n1 + n2;
			return res;
			
		};
		result = calculationInterface2.docalculation(10, 20);
		System.out.println("Result ::" + result);
		
		
		
		
		
		
	}

}
