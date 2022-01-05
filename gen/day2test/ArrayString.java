package com.org.genpact.day2test;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Part a
		
		String[] arr= new String[7];
		arr[0]="Sunday";
		arr[1]="Monday";
		arr[2]="Tuesday";
		arr[3]="Wednesday";
		arr[4]="Thursday";
		arr[5]="Friday";
		arr[6]="Saturday";
		
		// Part b
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
