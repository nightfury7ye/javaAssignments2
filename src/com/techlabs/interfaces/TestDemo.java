package com.techlabs.interfaces;

import java.util.function.Consumer;

public class TestDemo implements Demo1, Demo2{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		Demo1.super.method();
		
		String names[] = {"praveen", "Ashoka", "simon"};
		Consumer<String> printName = (name) -> System.out.println(name);
	}
	
}
