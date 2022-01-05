package com.org.genpact.day4;

abstract class Man{
	abstract void walk();
}


public class TestAnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m = new Man() {

			@Override
			void walk() {
				// TODO Auto-generated method stub
				System.out.println("Long track");
			}
			
		};
		m.walk();
	}

}
