package com.techlabs.two;

import java.util.Scanner;

public class TestMatrix {

	public static void main(String[] args) {
		int matrix[][] = new int[3][3];
		System.out.println("enter matrix");
		
		Scanner scanner = new Scanner(System.in);
		
		readMatrix(matrix, scanner);
		DisplayMatrix(matrix);

	}

	private static void DisplayMatrix(int[][] matrix) {
		for(int i = 0; i<3; i++) {
			displayRow(matrix,i);
			System.out.println("\n");
		}
		
	}

	private static void displayRow(int[][] matrix, int i) {
		for(int j = 0; j<3; j++)
			System.out.print(matrix[i][j]+"\t");
		
	}

	private static void readMatrix(int[][] matrix, Scanner scanner) {
		for(int i = 0; i<3; i++)
			readRow(matrix,scanner,i);
		
	}

	private static void readRow(int[][] matrix, Scanner scanner, int i) {
		for(int j = 0; j<3; j++)
			matrix[i][j] = scanner.nextInt();
	}

}
