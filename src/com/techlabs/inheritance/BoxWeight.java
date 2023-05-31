package com.techlabs.inheritance;

public class BoxWeight extends Box {
	double weight;
	
	void acceptWeight(double weight){
		this.weight = weight;
	}
	void displayWeight() {
		System.out.println("Weight: "+ weight);
	}
}
