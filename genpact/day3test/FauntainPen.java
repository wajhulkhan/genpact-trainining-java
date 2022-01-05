package com.org.genpact.day3test;
abstract class Pen1{
	
	abstract void write();
	abstract void refill();
	
}
class PenTest1 extends Pen1{

	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("This is write method");
	}

	@Override
	void refill() {
		// TODO Auto-generated method stub
		System.out.println("This is fefill method");
	}

}

public class FauntainPen extends PenTest{
	
	void changeNib() {
		System.out.println("You can change your nib");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FauntainPen fp = new FauntainPen();
		fp.write();
		fp.refill();
		fp.changeNib();
	}

}
