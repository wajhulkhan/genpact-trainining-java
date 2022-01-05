package com.org.genpact.day7;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String [] args) {
		TreeSet<Integer> eve = new TreeSet<Integer>();
		eve.add(4);eve.add(2); eve.add(6);
		TreeSet<Integer> e1 = new TreeSet<Integer>();
		e1.add(4);e1.add(11); e1.add(6);e1.add(3);e1.add(1);
		
		eve.addAll(e1);
		
		System.out.println("New treeset "+eve);
		
		System.out.println("First "+eve.first());
		System.out.println("Last "+eve.last());
		
		Iterator<Integer> t1= eve.iterator();
		while(t1.hasNext()) {
			System.out.println(t1.next());
		}
		// highest, lower, ceiling, floor
		System.out.println("Higher "+eve.higher(2));
		System.out.println("Lower "+eve.lower(4));
		System.out.println("Ceiling :"+eve.ceiling(4));
		System.out.println("floor :"+eve.floor(3));
		
		//pollfirst(); pollLast();headset();tailset()
		System.out.println("PollFirst :"+eve.pollFirst());
		System.out.println("PollLast :"+eve.pollLast());
		System.out.println("HeadSet :"+eve.headSet(5));
		System.out.println("HeadSet :"+eve.headSet(5,true));
		System.out.println("Tailset :"+eve.tailSet(4));
		System.out.println("Tailset :"+eve.tailSet(4, true));
		System.out.println("Subset :"+eve.subSet(4, 11));
		System.out.println("Subset :"+eve.subSet(4, false, 11, true));
		
		//Union, intersection
		eve.addAll(e1);
		System.out.println("Union Operation : "+eve);
		eve.retainAll(e1);
		System.out.println("Intersection : "+eve);
		eve.removeAll(e1);
		System.out.println("Difference : "+eve);
	}
}
