package com.techlabs.interfaces;

public class Rectangle implements IShape {
	private double width, height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public void area() {
		System.out.println("Area of rectangle: "+ width * height);
	}
}
