package com.org.genpact.day7;
// sorting of user define object
public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int marks;
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks=marks;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(marks==s.marks)
		return 0;
		else if(marks>s.marks)
			return 1;
		else
			return -1;
	}
	
}
