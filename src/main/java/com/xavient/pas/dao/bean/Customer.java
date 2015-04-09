package com.xavient.pas.dao.bean;

public class Customer {
	private int customerId;
	private String customerName;
	private String address;
	private String email;
	private int number;
	private String password;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customer(int customerId, String customerName, String address,
			String email, int number, String password) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.number = number;
		this.password = password;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
