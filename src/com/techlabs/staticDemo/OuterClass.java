package com.techlabs.staticDemo;

public class OuterClass {
	private int outerVariable;

    public class InnerClass {
        public void innerMethod() {
            outerVariable = 10; 
            System.out.println("Inner method: "+outerVariable);
        }
    }
}
