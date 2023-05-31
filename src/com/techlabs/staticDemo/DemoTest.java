package com.techlabs.staticDemo;

public class DemoTest {
	static int a = initialize();
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println("inside main");
		Demo demo = new Demo();

	}
	static {
		System.out.println("Inside Block");
	}
	private static int initialize() {
		System.out.println("Inside Initialize");
		return 20;
	}

}
