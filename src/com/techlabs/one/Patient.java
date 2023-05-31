package com.techlabs.one;

public class Patient {
	String name;
	BPLevel level;
	String medicine;
	public Patient(String name, BPLevel level) {
		this.name = name;
		this.level = level;
		prescribe();
	}
	public Patient() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BPLevel getLevel() {
		return level;
	}
	public void setLevel(BPLevel level) {
		this.level = level;
	}
	
	public String toString() {
		return "Name: "+ name + "\t level: " + level + "\t Medicine: " + medicine;
	}
	
	public void prescribe() {
		switch (level) {
		case High:
			medicine = "capsules";
			break;
		case Low:
			medicine = "Tablets";
			break;
		case Normal:
			medicine = "Syrup";
			break;
		default:
			break;
		}
	}
}
