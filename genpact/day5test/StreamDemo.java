package com.org.genpact.day5test;

import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stream.of()
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8,9);
		s1.forEach(p->System.out.println(p));
		
		Stream<Integer> s2 = Stream.of(new Integer[] {10,20,30,40,50,60,70,80,90});
		s2.forEach(p->System.out.println(p));
		
		//produce 10 random numbers
		
		Stream<Integer> ran = Stream.generate(()->(new Random()).nextInt(100));
		ran.limit(10).forEach(System.out::println);
	}

}
