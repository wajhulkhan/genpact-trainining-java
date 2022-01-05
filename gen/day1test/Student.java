package com.org.genpact.day1test;

public class Student {
	
	int rollNum;
	int phone;
	String address;
	
	public Student(int rollNum, int phone, String address) {
		super();
		this.rollNum=rollNum;
		this.phone=phone;
		this.address=address;
	}
	
	void print() {
		System.out.println(rollNum+" , "+phone+" , "+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Sam = new Student(101,455575848,"Lucknow");
		Student John = new Student(102,455344248,"Bangalore");
		Sam.print();
		John.print();

	}

}
