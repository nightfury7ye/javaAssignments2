package com.techlabs.one;

import java.util.Scanner;

public class EmpObj {

	public static void main(String[] args) {
		Employee emp1 = new Employee(0, null, 0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Name of employee: ");
		emp1.setEname(scanner.nextLine());
		System.out.println("enter eid of employee: ");
		emp1.setEid(scanner.nextInt());
		System.out.println("enter Salary of employee: ");
		emp1.setSalary(scanner.nextInt());
		
		
		
		System.out.println("Employee ID: "+ emp1.getEid());
		System.out.println("Employee name: "+ emp1.getEname());
		System.out.println("Employee Salary: "+ emp1.getSalary());
	}

}
