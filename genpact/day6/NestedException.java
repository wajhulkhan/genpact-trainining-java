package com.org.genpact.day6;

public class NestedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		      int arr[]={7,0,12,8};
		      try {
		        int x=arr[2]/arr[1];
		      }
		      catch(ArithmeticException e) {
		        System.out.println("Divide by Zero Exception");
		      }
		      arr[4]=3;
		    }
		    catch(ArrayIndexOutOfBoundsException e1) {
		      System.out.println("Array index is out of bound");
		    }
	}

}
