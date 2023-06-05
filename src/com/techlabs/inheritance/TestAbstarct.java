package com.techlabs.inheritance;

public class TestAbstarct {

	public static void main(String[] args) {
		Shape shape;
		shape = new Circle(10);
		shape.area();
		
		shape = new Rectangle(20,30);
		shape.area();

	}

}
