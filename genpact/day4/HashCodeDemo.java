package com.org.genpact.day4;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		System.out.println(obj1.hashCode());
		
		Object obj2 = new Object();
		System.out.println(obj2.hashCode());
		
		Object obj3 = new Object();
		System.out.println(obj3.hashCode());
		
		Object obj4= obj1;
		System.out.println(obj4.hashCode());
		
		System.out.println(obj1.equals(obj4));
		System.out.println(obj1.hashCode()+"  "+obj4.hashCode());
		System.out.println(obj2.equals(obj4));
		
		System.out.println(obj1.getClass());
		
		HashCodeDemo f = new HashCodeDemo();
		System.out.println(f.getClass());
		
		
		
		
	}

}
