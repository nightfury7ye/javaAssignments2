package com.techlabs.one;

public class Enum {
	
	public static void main(String[] args) {
		Level var = Level.WINTER;
		System.out.println(var);
		for (Level s : Level.values())
			System.out.println(s+" "+s);  
		}

}
