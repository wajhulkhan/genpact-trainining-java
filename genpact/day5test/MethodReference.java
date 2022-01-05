package com.org.genpact.day5test;
/*Method reference
 * Method ref is shorthand notation of a
 * 
 * */

interface Method1{
	void display();
}

class Multi{
	public static int m1(int x , int y) {
		return x+y*x;
		
	}
}


public class MethodReference {
	
	private static void PrivateMethod(){
		System.out.println("This is Private static method ");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Refering static method
		Method1 m1 = MethodReference::PrivateMethod;
		
		//calling interface method
		m1.display();
		
		// Lamda
		
	
	}

}
