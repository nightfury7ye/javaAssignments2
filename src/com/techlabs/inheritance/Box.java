package com.techlabs.inheritance;

public class Box {
	double width, height, depth;
	
	void acceptBox(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	void display() {
		System.out.println("Width: "+ width);
		System.out.println("Height: "+ height);
		System.out.println("Depth: "+ depth);
	}
}
