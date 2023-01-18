package com.citibank.main.domain;

import java.util.Objects;

public class Customer {
	private int CustomerId;
	private String name;
	private String address;
//	private double phoneNumber;
	
	
	public Customer(int customerId, String name, String address) {
		super();
		CustomerId = customerId;
		this.name = name;
		this.address = address;
//		this.phoneNumber = phoneNumber;
	}


	public int getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public int hashCode() {
		System.out.println("in hascode");
		return Objects.hash(CustomerId, address, name);
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return CustomerId == other.CustomerId && Objects.equals(address, other.address)
				&& Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "Customer [CustomerId = " + CustomerId + ", name = " + name + ", address = " + address + "]";
	}


	

	


	
}
