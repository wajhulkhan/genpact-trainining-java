package com.org.genpact.day5test;

import java.util.function.BiFunction;

interface A{
	public boolean chechdigit(int x);
}
class Digit{
	public static boolean isDigit(int x) {
		return x>10 && x<10;
	}
}

class Arith{
	public static int add(int a, int b) {
		return a+b;
	}
}

public class TestStaticMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lamda
		A a1 = (x)->{return x>10 && x<10;};
		System.out.println(a1.chechdigit(20));
		System.out.println();
		//methos ref
		
		A a2 = Digit :: isDigit;
		System.out.println(a2.chechdigit(9));
		System.out.println();
		
		BiFunction<Integer, Integer, Integer> a = Arith::add;
		int res =((BiFunction<Integer,Integer,Integer>)a1).apply(20,30);
		System.out.println(res);
		
		
	}

}
