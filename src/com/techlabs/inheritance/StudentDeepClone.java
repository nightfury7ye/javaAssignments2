package com.techlabs.inheritance;

public class StudentDeepClone implements Cloneable {
	private String name;
	private int age;
	public Contact contact;
	public StudentDeepClone(String name, int age, Contact contact){
	this.name = name;
	this.age = age;
	this.contact = contact;
	}
	public void displayData(){
	System.out.println("Name : "+this.name);
	System.out.println("Age : "+this.age);
	contact.displayContact();
	}
	protected Object clone() throws CloneNotSupportedException{
	StudentDeepClone student = (StudentDeepClone) super.clone();
	student.contact = (Contact) contact.clone();
	return student;
	}

}
