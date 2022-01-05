package com.org.gen.col;

import java.util.LinkedList;

public class DisplayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();

		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		
		System.out.println("Original list is : "+list);
		
		for(int i=0 ; i<list.size(); i++) {
			System.out.println("Element at index "+i+" : "+list.get(i));
		}
	}

}
