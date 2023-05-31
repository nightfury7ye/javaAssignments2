package com.techlabs.inheritance;

public class C extends B {
	public C() {
		System.out.println("INSIDE C");
	}
	public void display() {
		System.out.println("This is C class");
	}
	public void displayC() {
		System.out.println("This wont be printed");
	}
}
