package com.techlabs.inheritance;

public class ShallowClone implements Cloneable {
	private String name;
   private int rollNo;
   public ShallowClone(String name, int rollNo){
      this.name = name;
      this.rollNo = rollNo;
   }
   public void displayData(){
      System.out.println("Name : "+this.name);
      System.out.println("roll No. : "+this.rollNo);
   }
   public Object clone() throws CloneNotSupportedException{
      return super.clone();
   }
}
