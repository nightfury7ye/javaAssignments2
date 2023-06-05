package com.techlabs.interfaces;

public interface Demo1 {
	default void method() {
		System.out.println("Inside Demo1");
	}
}
