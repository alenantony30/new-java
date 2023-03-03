package com.admincutomer;

public class Customer extends User {

	private String customerName;
	private int customerId;
	public String getCustomerName() {
		return customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	
}
