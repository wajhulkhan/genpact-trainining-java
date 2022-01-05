package com.org.genpact.day9Test;

public class FindThreadNameAndClass  extends Thread{

		 public void run() {
		      for (int i = 0; i < 10; i++) {
		         printMsg();
		      }
		   }
		   public void printMsg() {
		      Thread t = Thread.currentThread();
		      String name = t.getName();
		      System.out.println("Thread name=" + name);
		   } 
		   public static void main(String[] args) {
			   FindThreadNameAndClass tt = new FindThreadNameAndClass();
		      tt.start();
		      for (int i = 0; i < 10; i++) {
		         tt.printMsg();
		      }

	}

}
