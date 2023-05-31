package com.techlabs.one;

public class Employee {
	
	int eid;
	String ename;
	int salary;
	
	public Employee(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee ID: "+ eid);
		System.out.println("Employee name: "+ ename);
		System.out.println("Employee Salary: "+ salary);
	}
	
	
}
