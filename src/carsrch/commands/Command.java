package carsrch.commands;

import java.io.IOException;

public abstract class Command {

	private String title;

	private String key;

	public Command(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public boolean isValid(String input) {
		return key.equals(input);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void printMenu() {
		System.out.println(String.format("%s - %s", this.key, this.title));
	}

	public abstract void doAction() throws IOException;

}
