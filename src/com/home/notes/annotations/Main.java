package com.home.notes.annotations;

public class Main {

	public static void main(String[] args) {
		printSmth();
	}

	@MyAnnotation(author = "Jhon Smith", date = "12/12/2017", reviewers = { "He", "She", "It" })
	public static void printSmth() {
		System.out.println("Annotated method.");
	}

}
