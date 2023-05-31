package com.techlabs.staticDemo;

public class Account {
	static int accountCount;
	private long accountNo;
	private double balance;
	String name;
	public Account(long accountNo, Double balance, String name) {
		++accountCount;
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		System.out.println("Account created: "+accountCount);
	}
	public Account() {
		++accountCount;
		System.out.println("Account created: "+accountCount);
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Account number:" + accountNo+  "\tName: "+ name+"\tBlanace: "+"\tbalance";
	}
}
