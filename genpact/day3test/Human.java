package com.org.genpact.day3test;

interface BasicAnimal{
	public void eat();
	public void sleep();
}

class Monkey{
	public void jump() {
		System.out.println("Monkey has jumped over a man");
	}
	
	public void bite() {
		System.out.println("Monkey bite us");
	}
}

public class Human extends Monkey implements BasicAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		h.eat();
		h.sleep();
		h.jump();
		h.bite();
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("This is a eat method");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("this is a sleep method");
	}

}
