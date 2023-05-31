package com.techlabs.one;

public class ObjRect {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(20, 10);
		rectangle.display();
		System.out.println("Area: "+ (rectangle.getHeight() * rectangle.getWidth()) );
		rectangle.getHeight();		
		Rectangle rectangle2 = new Rectangle(35.0, 15.0);
		rectangle2.setHeight(25.0);
		rectangle2.display();
	}

}
