/** interface created to perform crud operations
 * 
 */
package com.citibank.main.repository;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerRepositoryInterface {
/** determine what all methods will be in banking application to add or 
 * remove the customer.
 * 
 */
	public boolean addNewCutsomer(Customer customer);
	public Customer getCustomerByCustomerId(int CustomerId);
	public List<Customer> getAllCustomer();
	public boolean updateCustomerByCustomerId(Customer customer);
	public boolean deleteCustomerByCustomerId(int CustomerId);
}
