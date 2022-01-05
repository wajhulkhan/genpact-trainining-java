package com.org.gen.col;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();

		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		
		//iterating through a specified position
		
		Iterator<String> s = IteratorLinkedList.descendingIterator();
		 while(s.hasNext()) {
			 System.out.println(s.next());
		 }
		
	}

}
