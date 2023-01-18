package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerRepositoryInterface {
	
	private CustomerRepositoryInterface customerRepository = new CustomerRepository();

	@Override
	public boolean addNewCutsomer(Customer customer) {
		return customerRepository.addNewCutsomer(customer);
		
	}

	@Override
	public Customer getCustomerByCustomerId(int CustomerId) {
		return customerRepository.getCustomerByCustomerId(CustomerId);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.getAllCustomer()	;
		
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		return customerRepository.updateCustomerByCustomerId(customer);
		
	}

	@Override
	public boolean deleteCustomerByCustomerId(int CustomerId) {
		return customerRepository.deleteCustomerByCustomerId(CustomerId);
		
	}

}
