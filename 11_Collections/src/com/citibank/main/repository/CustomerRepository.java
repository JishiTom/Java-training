package com.citibank.main.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {
/* create a list*/	
	private List<Customer> customerList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public boolean addNewCutsomer(Customer customer) {
		
	// below line returns true or false based if addition is successful
		return customerList.add(customer);	
		}

	@Override
	public Customer getCustomerByCustomerId(int CustomerId) {
	
		for(Customer customer : customerList)
		if(customer.getCustomerId() == CustomerId ) {
			return customer;			
	}
		return null;}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {

		for(Customer c : customerList) {
		if(c.getCustomerId() == customer.getCustomerId() )
		{
			c = customer;
			System.out.println("customer details updated sucessfully");
			return true;	
		}
	} 
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int CustomerId) {
		
		for(Customer c : customerList) {
		if(c.getCustomerId() == CustomerId )
		{
			 return customerList.remove(c);
		}
	}
		
		return false;
	}

}
