package com.org.genpact.day4;

interface Age{
	int x=21;
	void getAge();
	
}
class MyClass implements Age{

	@Override
	public void getAge() {
		// TODO Auto-generated method stub
		System.out.println("Age is "+x);
	}}

public class GreateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m =new MyClass();
		m.getAge();
	}

}
