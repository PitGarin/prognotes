package com.home.notes.abstractclasses;

public class Main {

	public static void main(String[] args) {

		Animal[] animal = new Animal[3];
		animal[0] = new Cow("Cow");
		animal[1] = new Cat("Cat");
		animal[2] = new Dog("Dog");

		for (int i = 0; i < animal.length; i++) {
			System.out.println(String.format("Type - %s;", animal[i].getType()));
			animal[i].getSound();
		}

	}

}
