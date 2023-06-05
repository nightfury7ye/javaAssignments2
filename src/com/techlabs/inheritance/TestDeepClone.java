package com.techlabs.inheritance;

import java.util.Scanner;

public class TestDeepClone {

	public static void main(String[] args) throws CloneNotSupportedException{
	  Scanner scanner =new Scanner(System.in);
      System.out.println("Enter your name ");
      String name = scanner.next();
      System.out.println("Enter your age ");
      int age = scanner.nextInt();
      System.out.println("Contact details");
      System.out.println("Enter your phone number: ");
      long phoneNo = scanner.nextLong();
      System.out.println("Enter your Email ID: ");
      String email = scanner.next();
      System.out.println("Enter your address: ");
      String address = scanner.next();
      System.out.println("");
      StudentDeepClone student = new StudentDeepClone(name, age, new Contact(phoneNo, email, address));
      StudentDeepClone copiedStd = (StudentDeepClone) student.clone();
      copiedStd.contact.setPhoneNo(1234567890);
      copiedStd.contact.setEmail("replaced@gmail.com");
      copiedStd.contact.setAddress("Nowhere");
      System.out.println("Contents of the copied object::");
      copiedStd.displayData();
      System.out.println("");
      System.out.println("Contents of the original object::");
      student.displayData();


	}

}
