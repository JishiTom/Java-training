package com.citibank.main;

import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerjdbcMain {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String name;
		String address;
		CustomerService customerService = new CustomerService();
		List<Customer> customerList1 = customerService.getAllCustomer();
		// for loop to print the list
		
		for(Customer Cust1 : customerList1) {
			System.out.println(Cust1);
		}
		Customer customer2 = customerService.getCustomerByCustomerId(1);
		
		if(customer2 != null) {
			System.out.println(customer2);
			
		}else {
			System.out.println("no customer found");
		}
		System.out.println(" please enter the name  to be inserted");
		name = scanner.next();
		System.out.println("plese enter the address");
		address = scanner.next();
		
		Customer customer3 = new Customer(0, name, address);
		customerService.addNewCutsomer(customer3);
		
		List<Customer> customerList2 = customerService.getAllCustomer();
		for(Customer Cust1 : customerList2) {
			System.out.println(Cust1); }
		System.out.println("_____________________");
		
		
		
		Customer customer7 = new Customer(4, "kevin", "pune");
		customerService.updateCustomerByCustomerId(customer7);
		
		for(Customer Cust1 : customerList1) {
			System.out.println(Cust1);
		}
//		Customer customer8 = new Customer(6);
		customerService.deleteCustomerByCustomerId(6);
		
		
		
	}
}


