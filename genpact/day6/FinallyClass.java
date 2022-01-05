package com.org.genpact.day6;

public class FinallyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(FinallyClass.myMethod());
	}
		public static int myMethod() {
			try {
				return 100;
			}finally {
				System.out.println("This is final block");
			//	return 200;
			}
		}
	

}
