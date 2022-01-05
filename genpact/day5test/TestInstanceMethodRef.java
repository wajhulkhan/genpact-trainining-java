package com.org.genpact.day5test;

interface B{
	public void add(int x , int y);
}

class Addition{
	public void  sum(int a , int b) {
		System.out.println("The sum is : "+(a+b));
	}
}

public class TestInstanceMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition add1 = new Addition();
		
		//lamda
		
		B b1 = (a,b)->System.out.println("Sum = "+(a+b));
		b1.add(10,14);
		
		//method ref
		
		B b2 = add1::sum;
		b2.add(100, 1400);
	}

}
