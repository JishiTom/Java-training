package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;
import com.citibank.mian.factory.ConnectionFactory;


public class CustomerRepository implements CustomerRepositoryInterface {
/* create a list*/	
	private List<Customer> customerList = new ArrayList<>();
	
//	Connection connection = null;
 	private String sql;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private int rowCount;
	Connection connection = null;
	
	
	@Override
	public boolean addNewCutsomer(Customer customer) {
		
	// below line returns true or false based if addition is successful
		connection = new ConnectionFactory().getConnection();
		sql =" insert into customer_details(name, address) values(?, ?)";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			
			rowCount = preparedStatement.executeUpdate();
			if (rowCount >0)
			
				return true;
			}catch (SQLException e) {
				System.out.println("exception while executing query");
				System.out.println(e.getMessage());
				return false;
			}
		
		
		return false;
		}

	@Override
	public Customer getCustomerByCustomerId(int CustomerId) {
	
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details where customer_id =?";
		
		try {
			preparedStatement = connection.prepareStatement(sql) ;
			preparedStatement.setInt(1, CustomerId);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				
				int customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(customerId,name,address);
			 return customer;
			}
		} catch (SQLException e) {
			System.out.println("exception in query execution");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}			
	
		return null;
		}

	@Override
	public List<Customer> getAllCustomer() {
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details";
		
		try {
			preparedStatement = connection.prepareStatement(sql) ;
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(customerId, name, address);
				customerList.add(customer)
;			}
		} catch (SQLException e) {
			System.out.println("exception in query execution");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			System.out.println();
		}
		}
		return customerList;
	}
		

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "update customer_details set name =?, address=?where customer_id= ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql) ;
			preparedStatement.setInt(3, customer.getCustomerId());
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			rowCount = preparedStatement.executeUpdate();
			
			if(rowCount > 0) {
				System.out.println(rowCount);
	//			Customer customer1 = new Customer(customerId,name,address);
			 return true;
			}
		} catch (SQLException e) {
			System.out.println("exception in query execution");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}			
	
		return false;
		
	}

	@Override
	public boolean deleteCustomerByCustomerId(int CustomerId) {
		
		connection = new ConnectionFactory().getConnection();
		sql = "delete  from customer_details where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql) ;
			preparedStatement.setInt(1, CustomerId);
			rowCount = preparedStatement.executeUpdate();
			
			if(rowCount > 0) {
				System.out.println(rowCount);
	//			Customer customer1 = new Customer(customerId,name,address);
			 return true;
			}
		} catch (SQLException e) {
			System.out.println("exception in query execution");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}			
	
		return false;
	
	}

}
