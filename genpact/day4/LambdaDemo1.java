package com.org.genpact.day4;
import java.util.ArrayList;
import java.util.function.Consumer;
public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(5);
//		numbers.add(20);
//		numbers.add(34);
//		numbers.add(23);
//		numbers.forEach( (n) -> {System.out.println(n);});
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    Consumer<Integer> method = (n) -> { System.out.println(n); };
		    numbers.forEach( method );

	}

}
