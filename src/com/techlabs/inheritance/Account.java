package com.techlabs.inheritance;

public class Account {
	int accNo;
	String name;
	double balance;
	
	
	
	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}



	void acceptAccount(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}



	void displayAccount() {
		System.out.println("Account No: "+ accNo);
		System.out.println("Name: "+ name);
		System.out.println("Balance: "+ balance);
	}
}
