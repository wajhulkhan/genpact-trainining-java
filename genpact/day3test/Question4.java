package com.org.genpact.day3test;

abstract class telephone{
	 public abstract void lift();
	 public abstract void disconnected();
}

class SmartTelephone{
	public void lift() {
		System.out.println("This lift method is from SmartTelephone class");
	}
	
	public void disconnected() {
		System.out.println("This disconnected method is from SmartTelephone class");
	}
}

public class Question4 extends telephone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 q = new Question4();
		q.lift();
		q.disconnected();
		
		SmartTelephone st = new SmartTelephone();
		st.lift();
		st.disconnected();
		
	}

	@Override
	public void lift() {
		// TODO Auto-generated method stub
		System.out.println("This lift method is from telephone class");
		
	}

	@Override
	public void disconnected() {
		// TODO Auto-generated method stub
		System.out.println("This method is from telephone class");
		
	}

}
