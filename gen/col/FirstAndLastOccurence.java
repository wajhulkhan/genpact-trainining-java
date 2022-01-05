package com.org.gen.col;

import java.util.LinkedList;

public class FirstAndLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();

		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		 System.out.println("Original list :"+list);
		 
		 System.out.println("first element of the list is :"+list.getFirst());
		 System.out.println("Last element of the list is :"+list.getLast());
		 

			
	}

}
