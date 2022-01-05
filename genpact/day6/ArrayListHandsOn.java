package com.org.genpact.day6;

import java.util.ArrayList;

public class ArrayListHandsOn {

	public static void main(String[] args) {
		
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Gujjar");emp.add("Amir");emp.add("Sunny");emp.add("Ayaz");emp.add("Zafar");emp.add("Sahan");emp.add("oyaljjar");emp.add("Najjo");
		emp.add("Salman");emp.add("Akshay");emp.add("Saif");emp.add("Wajhul");emp.add("Sallu");emp.add("Faizal");emp.add("Roshni");emp.add("Afsana");
		emp.add("Abhishek");emp.add("Sumit");emp.add("Kallu");emp.add("Sumit");
		
		System.out.println(emp);
		
		System.out.println(emp.indexOf("Kallu"));
		
		System.out.println(emp.lastIndexOf("Sumit"));
		
		ArrayList<String> empl = new ArrayList<String>();
		empl.add("Waj");
		empl.add("Huda");
		System.out.println(empl);
		
		empl.addAll(emp);
		System.out.println(empl);
		
		empl.remove(0);
		System.out.println(empl);
		
		
		
		// TODO Auto-generated method stub

	}

}
