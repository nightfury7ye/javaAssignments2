package com.techlabs.one;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCustomer {

	public static void main(String[] args) {
		Customer cust = new Customer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Name of Customer: ");
		cust.setName(scanner.nextLine());
		System.out.println("enter custid of Customer: ");
		cust.setCustid(scanner.nextInt());
		scanner.nextLine();
		boolean isCorrect = false;
		while(isCorrect == false) {
			System.out.println("enter Email of Customer: ");
			String email = scanner.nextLine();
			String regex = "^[a-z0-9+_.-]+@[a-z]+(.+[a-z])$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			if((matcher.matches()) == (true)) {
				cust.setEmail(email);
				isCorrect = true;
			}
			else {
				System.out.println("Incorrect email format");
			}
		}
		
		System.out.println("enter Password of Customer: ");
		cust.setPassword(scanner.nextLine());
		
		
		
		System.out.println("Employee ID: "+ cust.getCustid());
		System.out.println("Employee name: "+ cust.getName());
		System.out.println("Employee Salary: "+ cust.getEmail());
		System.out.println("Employee Password: "+ cust.getPassword());

	}

}
