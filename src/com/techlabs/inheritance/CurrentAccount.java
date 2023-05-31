package com.techlabs.inheritance;

public class CurrentAccount extends Account {
	double OVER_DRAFT_LIMIT;
	
	public CurrentAccount(int accNo, String name, double balance, double oVER_DRAFT_LIMIT) {
		super(accNo, name, balance);
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}
	
	void acceptOVER_DRAFT_LIMIT(double oVER_DRAFT_LIMIT) {
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}
	void displayOVER_DRAFT_LIMIT() {
		System.out.println("OVER DRAFT LIMIT: "+ OVER_DRAFT_LIMIT);
	}
	
	
}
