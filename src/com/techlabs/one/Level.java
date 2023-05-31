package com.techlabs.one;

public enum Level {
	WINTER(5), SPRING(10), SUMMER(15), FALL(20);
    
    private int value;
	private Level(int value){  
	this.value=value;  
	}
}
