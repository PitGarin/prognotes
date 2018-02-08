package com.home.notes.common;

import javax.swing.JOptionPane;

public class NumberGuess {

	public static void main(String[] args) {

		int secretNumber; // Secret number to be guessed
		int numberIn; // The guessed number entered
		int trialNumber = 0; // Number of trials so far
		boolean done = false; // boolean flag for loop control

		secretNumber = (int) (Math.random() * 100);

		while (!done) {
			trialNumber++;
			String str = JOptionPane.showInputDialog("Set number between 0 and 100.");
			numberIn = Integer.parseInt(str);
			if (numberIn < 0 || numberIn > 100) {
				System.out.println("Number is out of scope. Try another number.");
			} else if (secretNumber == numberIn) {
				System.out.println("You win!!! Numbers of attempts are: " + trialNumber);
				done = false;
				System.exit(1);
			} else if (numberIn < secretNumber) {
				System.out.println("Wrong. Try higher.");
			} else if (numberIn > secretNumber) {
				System.out.println("Wrong. Try lower.");
			} else if (numberIn < 0 && numberIn > 100) {
				System.out.println("Number is out of scope. Try another number.");
			}

			System.out.println("Try again. " + "Current attempts are: " + trialNumber);
		}
	}

}
