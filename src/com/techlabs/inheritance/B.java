package com.techlabs.inheritance;

public class B extends A {
	public B() {
		System.out.println("inside B");
	}
	
	public void display() {
		System.out.println("This is B class");
	}
	public void displayB() {
		System.out.println("Will this print?");
	}
}
