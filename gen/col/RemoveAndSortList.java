package com.org.gen.col;

import java.util.ArrayList;

public class RemoveAndSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		
		System.out.println("The color list is : "+list);
		// removing 3rd element
		list.remove(2);
		System.out.println("After removing element : "+list);
		
		
	}

}
