package com.org.gen.col;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();

		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		
		//iterating through a specified position
		
		Iterator p = list.listIterator(2);
		 while(p.hasNext()) {
			 System.out.println(p.next());
		 }
		
		
		

	}

}
