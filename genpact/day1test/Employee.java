package com.org.genpact.day1test;

public class Employee {
	
	String emName;
	String yoj;
	int salary;
	String address;
	
	public Employee(String emName, String yoj, int salary, String address) {
		this.emName= emName;
		this.yoj=yoj;
		this.salary=salary;
		this.address= address;
		
	}
	
	void print() {
		System.out.println(emName+" "+" "+yoj+" "+" "+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee head  = new Employee("Name", "Year of Joining", 54564, "Address");
		Employee emp = new Employee("Robert", "1994",43523,"64C-WallStreet");
		Employee emp1 = new Employee("Sam", "2000",34342,"68D-WallStreet");
		Employee emp2 = new Employee("John","1999",43442,"26B-WallStreet");
		
		head.print();
		emp.print();
		emp1.print();
		emp2.print();

	}

}
