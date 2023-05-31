package com.techlabs.staticDemo;

public class EnclosedClass {
	private int value = 10;
	public static class StaticNestedClass {
        private static int staticNestedVariable = 10;

        public static void staticNestedMethod() {
            System.out.println("Static nested method: "+ staticNestedVariable);
        }
    }
}
