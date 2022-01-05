package com.org.genpact.day7;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("CoreJava");
		list.add("Servlet");
		list.add("AdvanceJava");
		list.add("Php");
		Collections.addAll(list, "JSP", "Spring");
		System.out.println(list);
		
		String[] s1 = {"c#", ".Net"};
		Collections.addAll(list, s1);
		//sorting of string object
		Collections.sort(list);
		System.out.println("After adding array collection value "+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse Order : "+list);
		
		//sorting wrapper class object
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(201);
		a1.add(102);
		a1.add(303);
		a1.add(500);
		Collections.sort(a1);
		System.out.println(a1);
	}

}
