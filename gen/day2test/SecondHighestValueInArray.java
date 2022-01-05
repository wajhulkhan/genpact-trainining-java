package com.org.genpact.day2test;

import java.util.Arrays;

public class SecondHighestValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {67,24,22,535,34,2342,45,23,42};
		Arrays.sort(arr);
		System.out.println("The second largest number is "+ arr[arr.length-2]);

	}

}
