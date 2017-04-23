package com.itskills;

public class Dog extends Mammal implements Carnivorous {

	@Override
	public void move() {
		System.out.println("Dog running..");
		// walk on 2 legs
		
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breathe() {
		super.breathe();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatMeat() {
		System.out.println("eating meat");
		// TODO Auto-generated method stub
	}

	
	public static void main(String[] args) {
		System.out.println("Dog called");
	}
}
