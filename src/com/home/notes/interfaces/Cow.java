package com.home.notes.interfaces;

public class Cow implements Sound {

	private String type;

	public Cow() {
		type = "KOROVA";

	}

	public String getType() {
		return type;
	}

	@Override
	public void getSound() {
		System.out.println("MUUUUU.");
	}

}
