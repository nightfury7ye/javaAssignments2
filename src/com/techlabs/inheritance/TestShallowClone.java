package com.techlabs.inheritance;

import java.util.Scanner;

public class TestShallowClone implements Cloneable {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
      	System.out.println("Enter your name ");
      	String name = scanner.next();
      	System.out.println("Enter your Roll no ");
      	int rollNo = scanner.nextInt();
      	ShallowClone std = new ShallowClone(name, rollNo);
      	System.out.println("Contents of the original object");
      	std.displayData();
      	System.out.println("Contents of the copied object");
		try {
			ShallowClone copiedStd = (ShallowClone) std.clone();
			copiedStd.displayData();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    scanner.close();

	}

}
