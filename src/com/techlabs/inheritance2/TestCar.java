package com.techlabs.inheritance2;

import java.util.Scanner;

public class TestCar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of cars you wish to enter:");
		int n = scanner.nextInt();
		
		Car car[] = new Car[n];
		for(int i = 0; i<n; i++ ) {
			scanner.nextLine();
			System.out.println("enter company name: ");
			String name = scanner.nextLine();
			System.out.println("enter mileage: ");
			double mileage = (double) scanner.nextInt();
			System.out.println("enter price: ");
			double price = (double) scanner.nextInt();
			car[i] = new Car(name,mileage,price);
		}
		for(int i = 0; i<n; i++ ) {
			car[i].displayPrice();
			System.out.println();
		}
		scanner.close();

	}

}
