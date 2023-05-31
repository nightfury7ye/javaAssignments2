package com.techlabs.one;

import java.util.Scanner;

public class PatientTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Patient patient[] = new Patient[5];
		
		for(int i = 0; i<5; i++ ) {
			System.out.println("enter Name of the Patient: ");
			String name = scanner.nextLine();
			System.out.println("enter BP Level of the Patient: ");
			String level = scanner.nextLine();
			patient[i] = new Patient(name, BPLevel.valueOf(level));
		}
		
		for(int i = 0; i<5; i++ ) {
			System.out.println(patient[i]);
		}
		scanner.close();
	}

}
