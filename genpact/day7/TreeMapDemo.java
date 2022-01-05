package com.org.genpact.day7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer , Book> map = new TreeMap<Integer, Book>();
		Book b1 = new Book(181, "Let us c", 8);
		Book b2 = new Book(182, "Java printer", 10);
		Book b3 = new Book(183, "Operating system", 5);
		Book b4 = new Book(184, "DBMS", 6);
		Book b5 = new Book(187, "JavaScript", 7);
		map.put(1, b1);
		map.put(2, b3);
		map.put(3, b4);
		map.put(4, b2);
		
		map.replace(3, b5);
		
		for(Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key+" "+"Details");
			System.out.println(b.id+" "+b.name+" "+b.quantity);
		}
	}

}
