package com.techlabs.inheritance;

public class Rectangle extends Shape {
	private double width;
    private double height;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public void area() {
		System.out.println("Rectangle Area: "+  width * height);
	}
}
