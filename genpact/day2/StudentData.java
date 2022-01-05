package com.org.genpact.day2;

class Data{
	public int roll_no;
	public String name;
	public Data(int roll_no, String name) {
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array of objects
		// We have created 5 objects
		Data[] arr=new Data[5];
		arr[0]=new Data(1,"Anurag");
		arr[1]=new Data(2,"Asha");
		arr[2]=new Data(3,"Abhijeet");
		arr[3]=new Data(4,"Ankur");
		arr[4]=new Data(5,"Aman");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements are "+arr[i]);
		}
		
		
	}

}
