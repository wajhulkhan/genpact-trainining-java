package com.org.gen.col;

import java.util.LinkedList;

public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();

		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		
		System.out.println("The color list is : "+list);
		
		//appending element at the end of linked list 
		list.addLast("Yellow");
		
		System.out.println("After appending the element : "+list);
	}

}
