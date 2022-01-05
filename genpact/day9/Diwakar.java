package com.org.genpact.day9;

import java.util.Scanner;

public class Diwakar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		for(int i=0; i <n;i++) {
			int j=i+1;
			System.out.println(i*j*j+",");
		}
		sc.close();

	}

}
