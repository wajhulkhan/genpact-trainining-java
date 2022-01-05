package com.org.genpact.day4;

class OuterClass{
    static  int x = 10;
    int y = 20;
    private static int outer = 30 ;

    //static inner class
    static class StaticClass{
        void display() {
            System.out.println(" x = "+ x);
            System.out.println("private member = "+outer);
            //System.out.println("y ="+ y);
        }
    }

}
public class NestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.StaticClass  demo = new  OuterClass.StaticClass();
		 
		demo.display();
	}

}
