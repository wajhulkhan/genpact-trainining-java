package com.org.genpact.day3;

interface NewInterface{
    void demo();

    //static method
    static void hello() {
        System.out.println(" Hello , new static method here ");
    }
    static int multi(int a , int b ) {
        int c = a*b;
        return c;
    }
    static void print() {
        System.out.println(" printing from interface ");
    }
}
public class InterfaceDemo implements NewInterface {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NewInterface.hello();
        int r =NewInterface.multi(2,3);
        System.out.println(" Multi static result = "+ r);
        NewInterface.print();
        print();
        InterfaceDemo  d= new InterfaceDemo();
        d.demo();
    }
   static void print() {
       System.out.println(" printing from class");
   }
    @Override
    public void demo() {
        // TODO Auto-generated method stub
        System.out.println(" This is abstract method ");
    }
 
}
