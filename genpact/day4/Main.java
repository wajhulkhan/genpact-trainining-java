package com.org.genpact.day4;
/* Marker interfaces: It is an empty interfaces, no fields and methods
 * example: Serializable, Cloneable, Remote
 * 
 * */
public class Main implements Cloneable{
	String name;
	int version;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Main obj1 = new Main();
		
		//init name and version using obj1
		obj1.name = "Java";
		obj1.version=11;
		System.out.println(obj1.name);
		System.out.println(obj1.version);
		
		//creating clone of obj1
		Main obj2 = (Main)obj1.clone();
		
		//changing value of name by using obj2
		obj2.name = "Python";
		System.out.println(obj2.name);
		
		System.out.println(obj1.name);
		System.out.println(obj1.equals(obj2));
		
		

	}

}
