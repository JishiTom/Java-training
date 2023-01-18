package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		int customerID;
		int option;
		
//		Customer customer;
		
		Customer customer1 = new Customer(101, "Jisha thomas ", "Chennai");
		Customer customer2 = new Customer(102, "Nidhi Soni ", "Chennai");
		Customer customer3 = new Customer(103, "Shweta ", "Chennai");
		Customer customer4 = new Customer(104, "Jiasdadad ", "Chennai");
		Customer customer5 = new Customer(105, "Kevin ROy ", "Chennai");
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		printAllCustomer(customerList);
		
		Scanner scanner = new Scanner(System.in);
//************
		System.out.println(" enter option to choose ur action");
		System.out.println("1. update customer");
		System.out.println("2. delete customer");
		option = scanner.nextInt();		
		
		if (option == 1) {
		
		String name, address;
		System.out.println("enter customerid");
		customerID = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("enter name");
		name = scanner.next();
		scanner.nextLine();
		
		System.out.println("enter address");
		address = scanner.next();
		
	Customer customer = new Customer(customerID, name, address);
		
		Customer updateCustomer = new Customer(customerID,name, address);
		updateCustomerByCustomerID(customerList,updateCustomer);
		
		}
		if (option == 2) {
			printAllCustomer(customerList);
			
			System.out.println("enter customerid to be deleted");
			customerID = scanner.nextInt();
			
			
//			Customer customer = new Customer();
			deleteCustomerByCustomerID(customerList,customerID);
		}
		
		printAllCustomer(customerList);
	}	
	
	private static void deleteCustomerByCustomerID(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for(Customer c : customerList) {
		if(c.getCustomerId() == customerId )
		{
			customerList.remove(c);
			flag = true;
			break;
			
		}
		}
		if (flag==false) {
			System.out.println("No customer found for the given customerId");
		}
	}
private static void updateCustomerByCustomerID(List<Customer> customerList, Customer customer)		{
	boolean flag = false;
	for(Customer c : customerList) {
	if(c.getCustomerId() == customer.getCustomerId() )
	{
		c.setName(customer.getName());
		c.setAddress(customer.getAddress());
		flag = true;
		System.out.println("customer details updated sucessfully");
		break;
		
	}
} 
if (flag == false){
	System.out.println("no customer found with the passed customer id");
}
}
//**********		
//		int customerID;
//		System.out.println("enter customer id");
//		customerID= scanner.nextInt();
//		printCustomerByChoice(customerList, customerID);	
	
	private static void printCustomerByChoice(List<Customer> customerList, int customerID) {
//		Customer customer = new Customer(CustomerID);
		boolean flag = false;
		for(Customer customer : customerList)
		if(customer.getCustomerId() == customerID ) {
			System.out.println(customer);
			flag = true;
			break;
		}
		if (flag == false){
			System.out.println("no customer found with the passed customer id");
		}
		
		
	}
	private static void printAllCustomer(List<Customer> customerList) {
		System.out.println("All Customers");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}

}
