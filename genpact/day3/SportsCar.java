package com.org.genpact.day3;

public class SportsCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.BrandName="SportsCar";
		car.color= "Black";
		car.Average="10Km/L";
		car.MaxSpeed=250;
		
		System.out.println("BrandName = "+car.BrandName);
		System.out.println("Color = "+car.color);
		System.out.println("Average = "+car.Average);
		System.out.println("MaxSpeed = "+car.MaxSpeed);
	}

}
