package com.techlabs.inheritance;

public class FourWheeler extends Vehicle {
	double mileage;
	
	public FourWheeler(String companyName, double mileage) {
		super(companyName);
		this.mileage = mileage;
	}
	void acceptMileage(double mileage) {
		this.mileage = mileage;
	}
	void displayMileage() {
		System.out.println("Mileage: "+ mileage);
	}
}
