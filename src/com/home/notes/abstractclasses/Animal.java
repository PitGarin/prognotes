package com.home.notes.abstractclasses;

public abstract class Animal {

	private String type;

	public Animal(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	abstract void getSound();

}
