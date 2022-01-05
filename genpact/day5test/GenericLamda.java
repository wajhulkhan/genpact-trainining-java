package com.org.genpact.day5test;

@FunctionalInterface
interface GenericInter<T>{
	//generic method
	T func(T t); //String func(String t)
	
}
public class GenericLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInter<String> rev = (str)->{
			
			String result = "";
			for(int i=str.length()-1; i>=0 ; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Lamda reverse "+ rev.func(" Genpact"));

			GenericInter<Integer> fact =(n) ->{
				int res = 1;
				for(int i=1; i<=n; i++)
					res=i*res;
				return res;
			};
			System.out.println("Factorial of 5 = "+fact.func(5));
			
			GenericInter<Double> Square= (n) -> {
				double result =0;
				result=Math.sqrt(n);
				return result;
			} ;
			
			System.out.println("Square of 3 = "+Square.func(3.0));
	}

}
