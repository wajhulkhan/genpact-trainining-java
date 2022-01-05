package com.org.gen.col;

import java.util.Date;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String department;
	private String dateOfJoining;
	private int age;
	private int salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String department, String dateOfJoining, int age, int salary) {
		super();
		this.id = id++;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public String getDate(){
		return dateOfJoining;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public void setDate(String dateOfJoining) {
		this.dateOfJoining=dateOfJoining;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	@Override
	public int compareTo(Employee em) {
		// TODO Auto-generated method stub
		if(salary==em.salary)
			return 0;
			else if(salary>em.salary)
				return 1;
			else
				return -1;
	}
	
	public String toString() {
		String str = String.format("%-15s %-30s %-30s %-10s %-10s\n", name,department,dateOfJoining,age,salary);
		
		return str;
		
	}
	
	
	

}
