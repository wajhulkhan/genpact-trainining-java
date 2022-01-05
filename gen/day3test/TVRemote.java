package com.org.genpact.day3test;

interface SmartTVRemote{
	void display();
}

interface TVRemotes extends SmartTVRemote{
	void print();
}

public class TVRemote	implements SmartTVRemote, TVRemotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVRemote tr = new TVRemote();
		tr.print();
		tr.display();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printed");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displayed");
	}

}
