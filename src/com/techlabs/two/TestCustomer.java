package com.techlabs.two;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter No. of Customers you want to Add: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		Customer customer[] = new Customer[n];
		
		for(int i = 0; i<n; i++ ) {
			customer[i] = new Customer();
			System.out.println("enter Name of Customer: ");
			customer[i].setName(scanner.nextLine());
			System.out.println("enter Customer id of Customer: ");
			customer[i].setCustid(scanner.nextInt());
			scanner.nextLine();
			accept(customer[i], scanner);
			
			System.out.println("enter Password of Customer: ");
			customer[i].setPassword(scanner.nextLine());
		}
		
		for(int i = 0; i<n; i++ ) {
			System.out.println(customer[i]);
		}
		System.out.println("\n");
		
		bubbleSort(customer);
		for(int i = 0; i<n; i++ ) {
			System.out.println(customer[i]);		
		}
	}
	
	public static void bubbleSort(Customer[] arr) {  
        int n = arr.length;  
        Customer temp;  
         for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                 if((arr[j-1].getName()).compareTo(arr[j].getName()) > 0) {
                         temp = arr[j-1];
                         arr[j-1] = arr[j];  
                         arr[j] = temp;  
                 }
                      
             }  
         }
	}
	

	private static void accept(Customer customer, Scanner scanner) {
		boolean isCorrect = false;
		while(isCorrect == false) {
			System.out.println("enter Email of Customer: ");
			String email = scanner.nextLine();
			isCorrect = validateMail(email, customer);
		}
		
	}

	private static boolean validateMail(String email, Customer customer) {
		String regex = "^[a-z0-9+_.-]+@[a-z]+(.+[a-z])$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if((matcher.matches()) == (true)) {
			customer.setEmail(email);
			return true;
		}
		System.out.println("Incorrect email format");
		return false;
	}

}
