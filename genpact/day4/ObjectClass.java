package com.org.genpact.day4;

import java.util.Objects;

/*
 * Object class methods 
 * toString()  change object into string
hashCode() give the hashcode of object
equals()  check address are equals are not
getClass() give the name of the class and package name
clone() cretae a shallow copy of object

*
*/
public class ObjectClass {
	static int Last_roll=200;
	int roll_no;
	
	
	
	public ObjectClass() {
		super();
		roll_no=Last_roll;
		Last_roll++;
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(roll_no);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		return roll_no == other.roll_no;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectClass o = new ObjectClass();
		System.out.println(o);
		System.out.println(o.toString());
	}

}
