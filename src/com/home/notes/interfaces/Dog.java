package com.home.notes.interfaces;

public class Dog implements Sound {

	private String name;
	

	public Dog() {
		name = "SOBAKA.";
	}

	@Override
	public String getType() {
		return name;
	}

	@Override
	public void getSound() {
		System.out.println("BARK.");
	}

}
