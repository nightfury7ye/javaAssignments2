package com.techlabs.one;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle() {
		this(5);
	}	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	Rectangle(double width) {
		this(width, 10);
		this.width = width;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	double getWidth() {
		return this.width;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	double getHeight() {
		return this.height;
	}
	
	public void display() {
		System.out.println("Width: "+ width);
		System.out.println("Height: "+ height);
	}
}
