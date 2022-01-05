package com.org.genpact.day2;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2012;
		if((year %400==0)|| ((year%4==0)&&(year%100!=0))) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}

	}

}
