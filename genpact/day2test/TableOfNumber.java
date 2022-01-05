package com.org.genpact.day2test;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter the number..");
		for(int i=0; i<5;i++) {
				int ans= n*i;
				System.out.println(n+"x"+i+"="+ans);
			}

	}

}
