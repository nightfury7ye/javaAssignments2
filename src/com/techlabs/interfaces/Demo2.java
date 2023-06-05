package com.techlabs.interfaces;

public interface Demo2 {
	default void method() {
		System.out.println("Inside Demo2");
	}
}
