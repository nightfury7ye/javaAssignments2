package com.techlabs.two;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter No. of Account you want to Add: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		Account accounts[] = new Account[n];
		
		for(int i = 0; i<n; i++ ) {
			accounts[i] = new Account();
			System.out.println("enter Name of account user: ");
			accounts[i].setName(scanner.nextLine());
			System.out.println("enter Account No. of account user: ");
			accounts[i].setAccNo(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Choose Acctype [1. savings, 2. current, 3. joint] type option No.");
			int choice  = scanner.nextInt();
			addAccType(accounts[i], scanner, choice);
			
			System.out.println("enter Balance of account user: ");
			accounts[i].setBalance(scanner.nextInt());
			scanner.nextLine();
		}
		
		bubbleSort(accounts);
		System.out.println(accounts[accounts.length - 1]+ " \n");
		
		for(int i = 0; i<n; i++ ) {
			System.out.println(accounts[i]);
		}

	}

//	private static int findGreatest(int balance, int greatest1, int i, int index) {
//		if(balance > greatest1) {
//			greatest = balance;
//			return i;
//		}
//		return index;
//		
//	}
	
	public static void bubbleSort(Account[] arr) {  
        int n = arr.length;   
        for(int i=0; i < n; i++){  
        	 executeJ(arr,i,n); 
        }
	}

	private static void executeJ(Account[] arr, int i, int n) {
        for(int j=1; j < (n-i); j++){  
        	swap(arr,j);       
       } 
	
}

	private static void swap(Account[] arr, int j) {
		Account temp;
		if(arr[j-1].getBalance() > arr[j].getBalance()){
            temp = arr[j-1];  
            arr[j-1] = arr[j];  
            arr[j] = temp;  
		} 
		
	}

	private static void addAccType(Account account, Scanner scanner, int choice) {
		switch (choice) {
		case 1:
			account.setAcctype(Acctype.SAVINGS);
			break;
		case 2:
			account.setAcctype(Acctype.CURRENT);
			break;
		case 3:
			account.setAcctype(Acctype.JOINT);
			break;

		default:
			System.out.println("Type only the specified options:");
			break;
		}
		
	}

}
