package com.org.genpact.day9Test;

public class JoinThreadTest extends Thread{
	public void run() {
		for(int i=0; i<2;i++) {
			try {
				Thread.sleep(500);
				System.out.println("The current thread name is: "+Thread.currentThread().getName());
				
			}catch(Exception e){
				System.out.println("The exception has been caught: "+e);
				
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThreadTest t1 = new JoinThreadTest();
		JoinThreadTest t2 = new JoinThreadTest();
		
		t1.start();
		try {
			System.out.println("The current thread name is: "+Thread.currentThread().getName() );
			 t1.join();
		}catch(Exception e) {
			System.out.println("The exception has been caught "+e);
		}
		
		t2.start();

	}

}
