package com.org.genpact.day3;

interface Robo1{
    void call_robo() ;
    void show() ;
}
 
interface Robo2{
    void danceRobo() ;
    void show() ;
    void robo_eat();
}
public class InterfaceTest implements Robo2 , Robo1{
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
InterfaceTest t = new InterfaceTest();
t.call_robo();t.show();
    }
 
    @Override
    public void call_robo() {
        // TODO Auto-generated method stub
        System.out.println("calling robo ");
    }
 
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("showing robo");
    }
 
    @Override
    public void danceRobo() {
        // TODO Auto-generated method stub
        System.out.println("dancing robo");
    }
 
    @Override
    public void robo_eat() {
        // TODO Auto-generated method stub
        System.out.println("robo can eat");
    }
 
}
