package com.home.notes.abstractclasses;

public class Cat extends Animal {

	public Cat(String type) {
		super(type);
	}

	@Override
	void getSound() {
		System.out.println("Cat");
	}

}
