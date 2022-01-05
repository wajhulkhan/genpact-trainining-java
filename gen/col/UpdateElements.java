package com.org.gen.col;

import java.util.ArrayList;

public class UpdateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list= new ArrayList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		
		System.out.println("The color list is : "+list);
		
		// updating element of index 3
		
		list.set(3, "Orange");
		
	System.out.println("Updated list is: "+list);
	}

}
