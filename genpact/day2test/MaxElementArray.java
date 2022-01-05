package com.org.genpact.day2test;

public class MaxElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {67,24,22,535,34,2342,45,23,42};
		int max =Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
		}
		System.out.println("The maxi number is "+max);

	}

}
