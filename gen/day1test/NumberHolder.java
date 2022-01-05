package com.org.genpact.day1test;

// Question no. 1
public class NumberHolder {
	
	public int anInt;
	public float aFloat;
	
	public NumberHolder(int anInt, float aFloat) {
		super();
		this.anInt=anInt;
		this.aFloat=aFloat;
	}
	  
	void print() {
		System.out.println(anInt+" , "+aFloat);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberHolder obj = new NumberHolder(6, 47.44f);
		obj.print();
		
	}

}
