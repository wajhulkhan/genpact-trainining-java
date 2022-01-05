package com.org.genpact.day6;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
		      int[] a= new int[5];
		      a[6]=23;
		      a[4] = 15/0;
		    }
		    catch(ArithmeticException e){
		        System.out.println("Arithmetic Exception Handled");
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		        System.out.println("Array index out of bound!");
		    }catch(Exception e) {
		    	System.out.println("Some other exception"+e);
		    }
		 System.out.println("Out of try catch");
	}

}
