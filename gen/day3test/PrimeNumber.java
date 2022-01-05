package com.org.genpact.day3test;

import java.util.Scanner;

interface in1{
	boolean display(int p);
}

public class PrimeNumber implements in1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of the numbers..");
		int T = sc.nextInt();
		PrimeNumber pm = new PrimeNumber();
		for(int i=2; i<=T;i++) {
			if(pm.display(i)) {
				total = total+1;
			}
		}
		System.out.println("Total Prime Numbers are = "+total);
		sc.close();
	}

	@Override
	public boolean display(int p) {
		for(int i=2; i<=p/2; i++) {
			
			if(p%i==0) {
				return false;
			}
			
		}
		return true;
		
		
	}

}
