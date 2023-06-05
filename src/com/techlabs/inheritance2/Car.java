package com.techlabs.inheritance2;

import java.text.DecimalFormat;

public class Car extends FourWheeler{
	double price;
	
	public Car(String companyName, double mileage, double price) {
		super(companyName, mileage);
		this.price = price;
	}

	void acceptPrice(double price) {
		this.price = price;
	}

	void displayPrice() {
		displayCompanyName();
		displayMileage();
		DecimalFormat decimalFormat = new DecimalFormat("#,##0");
	    String formattedPrice = decimalFormat.format(price);
		System.out.println("Price: "+ formattedPrice);
	}
}
