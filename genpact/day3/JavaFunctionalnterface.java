package com.org.genpact.day3;

interface TestInterface{
    //abstract method
    public void add(int x , int y );

    //default method
    default void show() {
        System.out.println("Defalut method using under funtional interface ");
    }
    default int calculate(int p , int q , int r ) {
        return p*q*r;
    }


}
 
interface myInter{
    void mainmethod();
    default void show() {
        System.out.println(" this is myInterface default method");
    }
}
 
 
public class JavaFunctionalnterface implements TestInterface , myInter{
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JavaFunctionalnterface jf = new JavaFunctionalnterface();

        jf.add(4,5);
        jf.show();
        int c = jf.calculate(2,3,4);
        System.out.println(c);
        
    }
 
    @Override
    public void add(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println("Addition = "+ (x+y));
    }

@Override
public void mainmethod() {
    // TODO Auto-generated method stub
    System.out.println(" this is mainmethod of interface 2 ");
}
 
@Override
public void show() {
    // TODO Auto-generated method stub
    myInter.super.show();
}
}
