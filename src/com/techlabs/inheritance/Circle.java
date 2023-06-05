package com.techlabs.inheritance;

public class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public void area() {
		System.out.println("Area Of Circle: "+ 3.14*radius*radius);
	}
}
