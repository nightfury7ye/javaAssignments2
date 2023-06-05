package com.techlabs.interfaces;

public class Circle implements IShape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void area() {
		System.out.println("Area of Circle: "+ 3.14 * radius * radius);
	}
	public void description() {
		System.out.println("Circles It Is");
	}
}
