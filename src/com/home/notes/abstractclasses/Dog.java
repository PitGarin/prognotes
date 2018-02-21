package com.home.notes.abstractclasses;

public class Dog extends Animal {

	public Dog(String type) {
		super(type);
	}

	@Override
	void getSound() {
		System.out.println("D");
	}

}
