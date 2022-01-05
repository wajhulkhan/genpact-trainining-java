package com.org.genpact.day2;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=20;
		int weight=50;
		
		if(age>18) {
			System.out.println("You can vote");
		}else {
			System.out.println("You can wait for voting..");
		}
		
		
		if((age>18)&&(weight==50)){
			System.out.println("You are healthy..");
		}else {
			System.out.println("You need to takecare of yourself");
		}

	}

}
