package com.techlabs.interfaces;

public interface IShape {
	void area();
	
	default void description() {
		System.out.println("Shapes It Is");
	}
}
