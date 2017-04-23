package com.itskills;

public class RunningAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		Animal animal = (Animal) dog;
		animal.move();
        
		
		Mammal mammal = (Mammal) dog;
		mammal.move();
		
		dog.eatMeat();
		
		
		Cat cat = new Cat();
		
		
		Mammal catMammal = (Mammal) dog;
		catMammal.move();
		
		if(catMammal instanceof Cat){
			Cat fictCat = (Cat) catMammal;
			fictCat.move();
	        
		}else if(catMammal instanceof Dog){
			Dog fictDog = (Dog) catMammal;
			fictDog.move();
	        
		}
		
		
	}
	
	
	

}
