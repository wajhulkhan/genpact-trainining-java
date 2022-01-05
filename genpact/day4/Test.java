package com.org.genpact.day4;
class CloneTest implements Cloneable{
	int i; String s;



	public CloneTest(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
public class Test{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		CloneTest ct= new CloneTest(4,"Cloneable interface");
		
		//downcasting
		CloneTest bb = (CloneTest)ct.clone();
		System.out.println(bb.i);
		System.out.println(bb.s);
		

	}

}
