package com.org.genpact.day3;
/*java 8 having SAM interface (single abstract method), means only one abstract method is allowed
 * A functional interface has only one abstract method but it can have multiple default methods.
@FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method.
 The use of this annotation is optional.
The java.util.function package contains many built in functional interfaces in Java 8.
 *  
 *  */
 

@FunctionalInterface
interface square{
    int cal(int x);//abstract method

}
 
public class Java8Test implements square{
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub

  int a = 7 ;
  Java8Test jt= new Java8Test();
  int x= jt.cal(a);
  System.out.println(x);

    }
 
    @Override
    public int cal(int x) {
        // TODO Auto-generated method stub
        return x*x;
    }
 
}
