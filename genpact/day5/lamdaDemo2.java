package com.org.genpact.day5;

interface MyInterface{
	String reverse(String n);
}

public class lamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface ref = (str) -> {
			String result = "";
			for(int i=str.length()-1; i>=0 ; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Lamda reverse "+ ref.reverse(" Genpact"));
	}

}
