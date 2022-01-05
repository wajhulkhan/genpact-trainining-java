package com.org.genpact.day9;

import com.org.genpact.day6.MultipleCatch;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1500);
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		System.out.println("State of thread while it called join");
	
	try {
		Thread.sleep(200);
		
	
		
	}catch(Exception e){
		
	}
	
	}
}
