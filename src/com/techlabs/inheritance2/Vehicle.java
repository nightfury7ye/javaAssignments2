package com.techlabs.inheritance2;

public class Vehicle {
	String companyName;
	
	public Vehicle(String companyName) {
		this.companyName = companyName;
	}
	void acceptCompanyName(String companyName) {
		this.companyName = companyName;
	}
	void displayCompanyName() {
		System.out.println("Company Name: "+ companyName);
	}
}
