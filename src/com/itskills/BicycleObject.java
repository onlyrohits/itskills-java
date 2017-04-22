package com.itskills;

public class BicycleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] gears = {1,2,3,4,5,6};
		Bicycle bicycle = new Bicycle(1, 10, 1,"BSA", 27*2.54f, 20.0f, gears);
		bicycle.accelerate(1);

		/*
		MountainBicycle mountainBicycle =  new MountainBicycle(1, 10, 1,"BSA", 27*2.54f, 20.0f, gears);
		mountainBicycle.accelerate(1);
		*/
	}

}
