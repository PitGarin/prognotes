package com.home.notes.interfaces;

public class Main {
	public static void main(String[] param) {

		Sound[] animal = new Sound[3];
		animal[0] = new Cat();
		animal[1] = new Cow();
		animal[2] = new Dog();
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i].getType() + " ");
			animal[i].getSound();
		}
	}
}
