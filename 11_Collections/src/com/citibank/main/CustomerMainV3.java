package com.citibank.main;

import java.util.HashSet;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Customer> customerSet= new HashSet<>();
		Customer customer1 = new Customer(101, "Jisha thomas ", "Chennai");
		Customer customer2 = new Customer(102, "Nidhi Soni ", "Chennai");
		Customer customer3 = new Customer(103, "Shweta ", "Chennai");
		Customer customer4 = new Customer(104, "Jiasdadad ", "Chennai");
		Customer customer5 = new Customer(105, "Kevin ROy ", "Chennai");
		Customer customer6 = new Customer(105, "Kevin ROy ", "Chennai");	
			
	System.out.println("First Customer ::" + customer1.hashCode());	
	System.out.println("first customer inserted::" + customerSet.add(customer1));
	
		System.out.println("second customer inserted::" + customerSet.add(customer2));
//		System.out.println("third customer inserted::" + customerSet.add(customer3));
//		System.out.println("fourth customer inserted::" + customerSet.add(customer4));
		System.out.println("Fivtht Customer ::" + customer5.hashCode());	
		System.out.println("first customer inserted::" + customerSet.add(customer5));
		
		System.out.println("fivth customer inserted::" + customerSet.add(customer5));
		
		System.out.println("six Customer ::" + customer6.hashCode());	
		System.out.println("first customer inserted::" + customerSet.add(customer6));
		
		System.out.println("Sixth customer inserted::" + customerSet.add(customer6));

		System.out.println(customerSet);
	}

}
