package com.techlabs.exceptions;

public class ExceptionsTest {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			double c;
			c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("Cant divide with zero");
		}
		catch (NumberFormatException e) {
			System.out.println("Cant enter string or char");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter both values");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("bye bye");
	}

}
