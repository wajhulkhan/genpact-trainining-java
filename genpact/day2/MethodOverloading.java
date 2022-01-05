package com.org.genpact.day2;

public class MethodOverloading {

	int add(int a , int b) {
		return a+b;
	}
	
	int add(int a , int b,int c) {
		return a+b+c;
	}
	
	float add(float a , float b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(6, 3));
		System.out.println(obj.add(4, 5,7));
		System.out.println(obj.add(6.8f, 8.34f));
		
	}

}
