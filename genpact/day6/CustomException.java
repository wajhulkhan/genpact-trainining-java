package com.org.genpact.day6;

class MinBalanceException extends Exception{

	public MinBalanceException() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Balance is low, please update your account");
		
	}
	
	
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int acc[]= {201,340,244,2345,45,33443,3445};
			int balance[] = {1900,4455,5525,5,532,3545,3234};
			System.out.println("Account no \t"+"Balance\t");
			for(int i=0; i<5;i++) {
				
				if(balance[i]<1000) {
					System.out.println(acc[i] +" \t "+balance[i]+" \t ");
					throw new MinBalanceException();
				}
		}
			
		}catch(MinBalanceException e) {
			System.out.println("Exception Caught");
		}
	}

}
