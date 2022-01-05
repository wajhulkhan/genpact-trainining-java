package com.org.genpact.day6;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		try{
			x=5;
			y=0;
			z=x/y;
			System.out.println("The output for z cannot be excuted");
		}
		catch(Exception e){
			System.out.println("Exception throws divide by 0 exception");
		}
		
	}

}
