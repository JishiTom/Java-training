package com.citibank.main;

import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CustomerService customerService = new CustomerService();
		Customer customer;
		int CustomerId;
		int option;
		//************
				System.out.println(" enter option to choose ur action");
				
			
				System.out.println("1. display all customer");
				System.out.println("2. Get customer by customer id");
				System.out.println("3. Update customer");
				System.out.println("4. Delete Customer");
				option = scanner.nextInt();
			
					
						System.out.println(" Adding  customer");
						
						Customer customer1 = new Customer(101, "Jisha thomas ", "Chennai");
						Customer customer2 = new Customer(102, "Nidhi Soni ", "Chennai");
						Customer customer3 = new Customer(103, "Shweta ", "Chennai");
						Customer customer4 = new Customer(104, "Jiasdadad ", "Chennai");
						Customer customer5 = new Customer(105, "Kevin ROy ", "Chennai");
							
							;
						System.out.println("first customer inserted::" + customerService.addNewCutsomer(customer1));
						System.out.println("second customer inserted::" + customerService.addNewCutsomer(customer2));
						System.out.println("third customer inserted::" + customerService.addNewCutsomer(customer3));
						System.out.println("fourth customer inserted::" + customerService.addNewCutsomer(customer4));
						System.out.println("fivth customer inserted::" + customerService.addNewCutsomer(customer5));
					
				
					if (option == 1) {
						
						
						
						List<Customer> customerList= customerService.getAllCustomer();
						for(Customer customer6 : customerList) {
							System.out.println(customer6);
							System.out.println("___________________");
					}
					}
					if (option == 2) {
						
						System.out.println("enter customerid");
						CustomerId = scanner.nextInt();
						Customer customer7 = customerService.getCustomerByCustomerId(CustomerId);
						System.out.println(customer7);
						
					}
					if (option == 3 ) {
						String name, address;
						System.out.println("enter customerid");
						CustomerId = scanner.nextInt();
						scanner.nextLine();
						
						System.out.println("enter name");
						name = scanner.next();
						scanner.nextLine();
						
						System.out.println("enter address");
						address = scanner.next();
						
						Customer customer8= new Customer(CustomerId, name, address);
						customerService.updateCustomerByCustomerId(customer8);
						
						boolean result = customerService.updateCustomerByCustomerId(customer8);
						
						if (result) {
							System.out.println("update successfull");
						}else {
							System.out.println("update nsuccessfull");
						}
					}
					if (option == 4) {
						List<Customer> customerList1= customerService.getAllCustomer();
						for(Customer customer9 : customerList1) {
							System.out.println(customer9);
							System.out.println("___________________");
							
						System.out.println("enter customerid to be deleted");
						CustomerId = scanner.nextInt();
						
						customerService.deleteCustomerByCustomerId(CustomerId);
						
						boolean result = customerService.deleteCustomerByCustomerId(CustomerId);
						if (result) {
							System.out.println("update successfull");
						}else {
							System.out.println("update nsuccessfull");
						}
					}
				
				}		
	}

}

