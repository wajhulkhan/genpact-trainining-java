package com.org.genpact.day9Test;

public class TwoThreadsStartSameTime extends Thread{
	
	public void run() {
		System.out.println("Hands on");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoThreadsStartSameTime t1 = new TwoThreadsStartSameTime();
		TwoThreadsStartSameTime t2 = new TwoThreadsStartSameTime();
		
		t1.start();
		t2.start();
		

	}

}
