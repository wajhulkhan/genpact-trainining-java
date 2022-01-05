package com.org.genpact.day2test;



public class Bank {
	
	int interest(int p, int r) {
		return (p*r)/100;
	}
	
	int interest(int p, int r, int t) {
		return (p*r*t)/100;
	}
	
	float interest(float p, float r) {
		return (p*r)/100;
	}
	
	float interest(float p, float r, float t) {
		return (p*r*t)/100;
	}
	
	double interest(double p, double r, double t) {
		return (p*r*t)/100;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Bank();
		System.out.println(obj.interest(67, 76));
		System.out.println(obj.interest(67, 78,76));
		System.out.println(obj.interest(67.88f, 78.78f));
		System.out.println(obj.interest(67.66f, 78.46f,87.56f));
		System.out.println(obj.interest(67.343, 78.424,334.223));
	}

}
