package com.org.genpact.day5test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> member = new ArrayList<>();
		member.add("Ainky");
		member.add("Raj");
		member.add("Pam");
		member.add("Raheem");
		member.add("Parvesh");
		member.add("Yes");
		
		//intermediate operations
		//Stream.filter
		
		member.stream().filter((s)-> s.startsWith("A")).forEach(System.out::println);
//		ArrayList<Integer> num = new ArrayList<>();
//		num.add("4");
//		num.add("5");
//		num.add("3");
//		num.add("8");
//		num.add("2");
//		num.add("9");
		
		//stream.map()
		System.out.println();
		member.stream().filter((a)->a.startsWith("P")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println();
		//stream.sorted()
		member.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		//distinct()
		List<String> m2 = member.stream().distinct().collect(Collectors.toList());
		System.out.println("DIstinct data "+m2);
		
		//flapMap()
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> list = Arrays.asList(list1,list2,list3);
		
		List<Integer> list6 = list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println("FlateMap() "+list6);
		
		
		
		
		
		// terminal Operation
		//forEach()
		member.forEach(System.out::println);
		System.out.println();
		//stream.collect()
		member.stream().sorted().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		
		//stream.match()
		System.out.println();
		boolean res = member.stream().anyMatch((p)->p.startsWith("A"));
		System.out.println(res);
		
		System.out.println();
		res= member.stream().allMatch((p)->p.startsWith("A"));
		System.out.println(res);
		System.out.println();
		
		res = member.stream().noneMatch((p)->p.startsWith("A"));
		System.out.println(res);
		System.out.println();
		
		//count()
		long total = member.stream().filter((s)->s.startsWith("A")).count();
		System.out.println(total);
		System.out.println();
		
		//findfirst()
		String fname = member.stream().filter((p)->p.startsWith("R")).findFirst().get();
		System.out.println(fname);
		System.out.println();
		
		
		
		
		
	}

}
