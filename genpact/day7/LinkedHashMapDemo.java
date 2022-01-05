package com.org.genpact.day7;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, String> ln = new LinkedHashMap<String, String>();
		ln.put("A", "Albert");
		ln.put("B", "Bob");
		ln.put("C", "Coco");
		ln.put("D", "Doddle");
		ln.put("E", "Dobby");
		System.out.println(ln);
		System.out.println("Getting value of key: "+ln.get("B"));
		System.out.println("Size: "+ln.size());
		System.out.println("Check value: "+ln.containsKey("D"));
		System.out.println("Check the value of key : "+ln.containsValue("Coco"));
		System.out.println("Remove entry: "+ln.remove("C"));
		System.out.println(ln);
		
		//entryset(), keyset(), value();
		System.out.println("Key/value mapping : "+ln.entrySet());
		System.out.println("keySet: "+ln.keySet());
		System.out.println("values of keys :"+ln.values());
		System.out.println(ln.get("C"));// there is no key c, then it will return null
		System.out.println("value of the key: "+ln.getOrDefault("X", "X-max"));
		
	}

}
