package com.techlabs.staticDemo;

public class MathsTest {

	public static void main(String[] args) {
		int a = 20,b = 7;
		double r = 9.5;
		System.out.println(Maths.Arithmetic.add(a, b));
		System.out.println(Maths.Geometry.calculateCircleArea(r));
		EnclosedClass.StaticNestedClass.staticNestedMethod();
		
		OuterClass outerObj = new OuterClass();
		OuterClass.InnerClass innerObj = outerObj.new InnerClass();
		innerObj.innerMethod();

	}

}
