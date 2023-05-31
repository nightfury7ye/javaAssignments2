package com.techlabs.two;

public class Customer {
	private int customerid;
	private String name, email, password;
	public int getCustid() {
		return customerid;
	}
	public void setCustid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Customer(int customerid, String name, String email, String password) {
		this.customerid = customerid;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public Customer() {
		
	}
	public String toString() {
		return "Customer id: "+ customerid+ "\t \t Name: "+ name + "\t \t email: " + email + "\t \t Password: " + password;
	}
	
	

}
