package com.techlabs.one;

public class Swapper {

	public static void main(String[] args) {
		Number number = new Number(10, 20);
	    
	    System.out.println("Before Swappig:");
	    System.out.println("a="+number.getA()+"\t"+"b="+number.getB());
	    
	    swap(number);//actual parameters
	    
	    System.out.println("After Swappig:");
	    System.out.println("a="+number.getA()+"\t"+"b="+number.getB());

	  }

	  private static void swap(Number number) // formal parameters
	  {
	    int temp;
	    temp=number.getA();
	    number.setA(number.getB());
	    number.setB(temp);


	}

}
