package com.techlabs.inheritance;

public class TestAccount {

	public static void main(String[] args) {
		CurrentAccount currentAccount = new CurrentAccount(12, "Praveen", 12000,350);
		SavingsAccount savingsAccount = new SavingsAccount(14, "Pavan", 1000,6);
		
		currentAccount.displayAccount();
		currentAccount.displayOVER_DRAFT_LIMIT();
		System.out.println("\n");
		savingsAccount.displayAccount();
		savingsAccount.displaySavingsAccount();
	}

}
