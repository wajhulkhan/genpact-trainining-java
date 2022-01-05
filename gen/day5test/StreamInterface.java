package com.org.genpact.day5test;

import java.util.ArrayList;
import java.util.stream.Stream;

/*In java  java.util.Stream interface;
 * 1)stream operation are either intermediate or terminal
 * terminal operation return result certain type
 * intermediate operation return the stream itself so we can chain multiple methos in 
 * multiple steps
 **/

// Object as a data source
public class StreamInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> rr = new ArrayList<String>();
		rr.add("Java");
		rr.add("Python");
		rr.add("DataStructure");
		rr.add("DBMS");
		
	// creating object of stream where stream is created using arralist and object as data sourse
		Stream<String> name = rr.stream();
		
	//print and display
		//System.out.println(" Data : "+name);
	
		name.forEach(a->System.out.println(a));
		
	}

}
