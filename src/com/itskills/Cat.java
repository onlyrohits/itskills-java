package com.itskills;

public class Cat extends Mammal {

	String name;
	int age;
	int weight;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cat(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void move() {
		System.out.println("cat running..");
		// walk on 2 legs
		
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breathe() {
		System.out.println("Cat breathes");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	
	
	
	public static void main(String[] args) {
		Cat cat = new Cat("Lucy", 10, 15);
		System.out.println(cat);
	}
	

}
