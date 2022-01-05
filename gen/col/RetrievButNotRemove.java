package com.org.gen.col;

import java.util.LinkedList;

public class RetrievButNotRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();

		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		System.out.println("Original List : "+list);
		
		System.out.println("Last element in the list: "+list.peekLast());
		
		System.out.println("Original List : "+list);
		
	}

}
