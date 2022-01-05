package com.org.gen.col;

import java.util.LinkedList;

public class CheckItemExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();

		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		System.out.println("Original List : "+list);
		
		if(list.contains("Red"))
			System.out.println("Color red is present");
		else
			System.out.println("Color red not present");
		
		if(list.contains("Indigo"))
			System.out.println("Color indigo present");
		else
			System.out.println("color indigo not present");
	}

}
