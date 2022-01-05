package com.org.genpact.day9;

public class ThreadJoin extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		t1.start();
		try {
			t1.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();
		t3.start();
		
	}
	

}
