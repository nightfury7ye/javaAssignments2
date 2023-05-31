package com.techlabs.inheritance;

public class SavingsAccount extends Account {
	double INTEREST_RATE;

	public SavingsAccount(int accNo, String name, double balance, double iNTEREST_RATE) {
		super(accNo, name, balance);
		INTEREST_RATE = iNTEREST_RATE;
	}
	void acceptSavingsAccount(double INTEREST_RATE) {
		this.INTEREST_RATE = INTEREST_RATE;
	}
	void displaySavingsAccount() {
		System.out.println("INTEREST RATE: "+ INTEREST_RATE);
	}
	
	
}
