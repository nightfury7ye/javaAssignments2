package com.techlabs.inheritance;

public class TestBoxWeight {

	public static void main(String[] args) {
		BoxWeight boxWeight = new BoxWeight();
		boxWeight.acceptBox(5, 10, 6);
		boxWeight.acceptWeight(25);
		boxWeight.display();
		boxWeight.displayWeight();

	}

}
