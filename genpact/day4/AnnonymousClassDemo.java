package com.org.genpact.day4;

interface Age1{
	int x=21;
	void getAge();
}
public class AnnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age1 obj = new Age1() {

			@Override
			public void getAge() {
				// TODO Auto-generated method stub
				System.out.println("Age is -> "+x);
			}
			
		};
		obj.getAge();

	}

}
