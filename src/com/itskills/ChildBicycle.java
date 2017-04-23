package com.itskills;

public class ChildBicycle extends Bicycle {

	
	public static void main(String[] args) {
		ChildBicycle childBicycle = new ChildBicycle();
		childBicycle.accelerate(10);
	}

	@Override
	public void brake(int decrement) {
		// TODO Auto-generated method stub
		super.brake(decrement);
	}

	@Override
	public void accelerate(int increment) {
		// TODO Auto-generated method stub
		increment = 20;
		super.accelerate(increment);
	}
	
	
}
