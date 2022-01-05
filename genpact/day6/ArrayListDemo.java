package com.org.genpact.day6;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Kolkata");
		list.add("Chennai");
		
		System.out.println("ArrayList element "+list);
		list.remove(3);
		list.remove("Kolkata");
		
		//add element at index 3
		
		list.add(1, "Banaras");
		System.out.println("ArrayList element afte update "+list);
		
		ArrayList<String> li = new ArrayList<String>();
		li.add("Pune");
		li.add("Hyderabad");
		System.out.println("ArrayList element  "+li);
		//adding list element in list1
		list.addAll(li);
		System.out.println("FinalList "+list);
		System.out.println("ArrayList contains :"+ list.contains("Pune"));
		
		ArrayList<String> color  = new  ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Pink");
		
		System.out.println("Get data "+color.get(2));
		
		System.out.println("Set DAta "+color.set(2, "Yellow"));
		System.out.println(color);
		
		System.out.println("Isempty "+color.isEmpty());
		
	}

}
