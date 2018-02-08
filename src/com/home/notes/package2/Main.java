package com.home.notes.package2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Insert number.");
		int number = Integer.parseInt(str);// parse passed string into number//
		// int number stores parsed value

		CheckNumbers.isPerfect(number);
	}

}
