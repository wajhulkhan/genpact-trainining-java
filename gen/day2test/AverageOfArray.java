package com.org.genpact.day2test;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add=0;
		double average=0;;
		int[] arr= {38,34,3,13,55,55,55,24,56,34};
		for(int i=0; i<arr.length;i++) {
			add=add+arr[i];
			average = add/arr.length;
		}
		System.out.println("Average of the Array is "+average);

	}

}
