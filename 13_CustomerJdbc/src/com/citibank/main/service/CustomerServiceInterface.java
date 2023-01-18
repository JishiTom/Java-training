package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerServiceInterface {

	public boolean addNewCutsomer(Customer customer);
	public Customer getCustomerByCustomerId(int CustomerId);
	public List<Customer> getAllCustomer();
	public boolean updateCustomerByCustomerId(Customer customer);
	public boolean deleteCustomerByCustomerId(int CustomerId);
}
