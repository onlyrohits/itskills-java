package com.itskills;

public class MountainBicycle extends Bicycle { // Sub Class
	
	/*
		What You Can Do in a Subclass
	
		A subclass inherits all of the public and protected members of its parent, no matter what package the subclass is in. If the subclass is in the same package as its parent, it also inherits the package-private members of the parent. You can use the inherited members as is, replace them, hide them, or supplement them with new members:
	
		The inherited fields can be used directly, just like any other fields.
		You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
		You can declare new fields in the subclass that are not in the superclass.
		The inherited methods can be used directly as they are.
		You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
		You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
		You can declare new methods in the subclass that are not in the superclass.
		You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.
		The following sections in this lesson will expand on these topics.
	*/

	public MountainBicycle(int startCadence, int startSpeed, int startGear, String manufacturerName,
			float bicycleHeight, float bicycleWeight, int[] gears) {
		//super(startCadence, startSpeed, startGear, manufacturerName, bicycleHeight, bicycleWeight, gears);
		// TODO Auto-generated constructor stub
		setPillionSeat();
		addExtraStrength();
	}

	public void setPillionSeat(){
		// Add seats here
		System.out.println("2 people seats");
	}
	
	public void addExtraStrength(){
		// Add strength to the bicycle
		System.out.println("Cycle is extra strong");
	}
	
}
