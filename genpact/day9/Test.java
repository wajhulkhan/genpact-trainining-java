package com.org.genpact.day9;

public class Test implements Runnable {
public static Thread thread1;
public static Test obj;
	public static void main(String[] args) {
		obj = new Test();
		thread1 = new Thread(obj);
		System.out.println("State of thread1 after creating it - "+thread1.getState());
		thread1.start();
		System.out.println("State of thread1 after calling .start() method on it - "+thread1.getState());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread1 mythread = new Thread1();
		Thread thread2 = new Thread(mythread);
		System.out.println("State of thread2 after creating it - "+thread2.getState());
		thread2.start();
		System.out.println("State of thread2 after calling .start() "+thread2.getState());
		try {
			Thread.sleep(200);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("State of thread2 after calling it - "+thread2.getState());
		
	
	
		try {
			thread2.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("State of thread2 when it has finished execution - "+thread2.getState());
	}

}
