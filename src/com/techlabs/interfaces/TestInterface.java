package com.techlabs.interfaces;

public class TestInterface {

	public static void main(String[] args) {
		IShape shape;
		shape = new Circle(6);
		shape.description();
		shape.area();
		shape = new Rectangle(10, 15);
		shape.description();
		shape.area();

	}

}
