package com.org.genpact.day2test;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter the number..");
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>=1;i--) {
			for(int j=1; j<=i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
