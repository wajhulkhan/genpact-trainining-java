package com.org.genpact.day7;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet();
		set.add("Waj");
		set.add("Hul");
		set.add("Huda");
		
		HashSet<String> set1 = new HashSet();
		set1.add("Sul");
		set1.add("COol");
		set1.addAll(set1);
		
		System.out.println("Accessing... ");
		 Iterator<String> it = set.iterator();
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 System.out.println("For Each loop...");
		 
		 for(String val : set) {
			 System.out.println(val+" ");
		 }
		
	}

}
