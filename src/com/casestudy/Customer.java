package com.casestudy;


public class Customer {
	String customerName;
    String location;
    float planAmount;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(float planAmount) {
		this.planAmount = planAmount;
	}
	public Customer(String customerName, String location, float planAmount) {
		super();
		this.customerName = customerName;
		this.location = location;
		this.planAmount = planAmount;
	}

}
