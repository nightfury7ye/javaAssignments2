package com.techlabs.two;

public class Account {
	int accNo, balance;
	String name;
	Acctype acctype;
	public Account(int accNo, int balance, String name, Acctype acctype) {
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
		this.acctype = acctype;
	}
	public Account() {
		
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Acctype getAcctype() {
		return acctype;
	}
	public void setAcctype(Acctype acctype) {
		this.acctype = acctype;
	}
	
	public String toString() {
		return "Account No.: "+ accNo+ "\t \t Name: "+ name + "\t \t Account Type: " + acctype + "\t \t Balance: " + balance;
	}
}
