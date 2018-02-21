package com.home.notes.interfaces;

public class Cat implements Sound {

	private String type;

	public Cat() {
		type = "KOT";
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void getSound() {
		System.out.println("MEOW.");
	}

}
