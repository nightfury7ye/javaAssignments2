package com.techlabs.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestReflections {

	public static void main(String[] args) throws ClassNotFoundException {
		Class stringReflect = Class.forName("java.lang.String");
		
		System.out.println(stringReflect.getClass());
		System.out.println(stringReflect.getName());
		
		Constructor constructors[] = stringReflect.getConstructors();
		
		for(Constructor constructor: constructors) {
			System.out.println(constructor);
		}
		
		Method methods[] = stringReflect.getDeclaredMethods();
		
		for(Method method: methods) {
			System.out.println(method.getName());
		}
		
		String string = stringReflect.toGenericString();

	}

}
