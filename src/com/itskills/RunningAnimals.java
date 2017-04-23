package com.itskills;

public class RunningAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();      
        Animal a = (Animal)d;
        
        a.move();
        
        
        Mammal m = (Mammal) d;
        m.move();
        
        Carnivorous carnivorous = (Carnivorous) d;
        
        
	}

}
