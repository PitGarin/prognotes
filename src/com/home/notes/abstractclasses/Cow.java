package com.home.notes.abstractclasses;

public class Cow extends Animal {

	public Cow(String type) {
		super(type);
	}

	@Override
	void getSound() {
		System.out.println("C");
	}

}
