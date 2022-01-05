package com.org.genpact.day2test;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter the number..");
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(" ");
			}
			for(int k =1; k<(i*2)-1;k++) {
				System.out.println(" * ");
			}
			System.out.println();
		}

	}

}
