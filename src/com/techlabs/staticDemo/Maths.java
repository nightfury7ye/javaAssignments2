package com.techlabs.staticDemo;
import java.lang.Math;

public class Maths {
	public Maths() {
    	
    }

    public static class Arithmetic {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }
    }

    public static class Geometry {
        public static double calculateCircleArea(double radius) {
            return Math.PI * radius * radius;
        }
    }
}
