package com.techlabs.one;

public class AddComplex {

	public static void main(String[] args) {
		
		Complex cn1 = new Complex(5.5, 4);
		Complex cn2 = new Complex(3.8, 2.5);
		
		Complex cn3 = sum(cn1, cn2);
		System.out.println("Sum is: "+ cn3.real+" + "+ cn3.img +"i");

	}

	private static Complex sum(Complex cn1, Complex cn2) {
		Complex cn3 = new Complex(0,0);
		
		cn3.setReal(cn1.getReal() + cn2.getReal());
		cn3.setImg(cn1.getImg() + cn2.getImg());
		
		return cn3;
	}

}
