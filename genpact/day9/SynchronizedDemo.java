package com.org.genpact.day9;
//synchronization method
class DataDemo{
synchronized	void printNum(int n) {
		for(int i=1; i<=10;i++) {
			System.out.println((n*i));
		}
		try {
			Thread.sleep(500);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class Num2 extends Thread{
	DataDemo d ;

	public Num2(DataDemo d) {
		super();
		this.d = d;
	}
	public void run() {
		d.printNum(5);
	}
}
class Num1 extends Thread{
	DataDemo d ;

	public Num1(DataDemo d) {
		super();
		this.d = d;
	}
	public void run() {
		d.printNum(4);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataDemo obj = new DataDemo();
		Num1 t1= new Num1(obj);
		Num2 t2= new Num2(obj);
		t1.start();
		t2.start();
		
	}

}
