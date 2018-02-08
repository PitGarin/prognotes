package com.home.notes.common;

public class CozaLozaWoza {

	public static void main(String[] args) {

		int upperBound = 110;
		int step = 11;
		int stepCounter = 0;
		for (int lowerBound = 1; lowerBound < upperBound; lowerBound++) {

			if (lowerBound % 3 == 0) {
				System.out.print("Coza ");
			} else if (lowerBound % 5 == 0) {
				System.out.print("Loza ");
			} else if (lowerBound % 7 == 0) {
				System.out.print("Woza ");
			} else if (lowerBound % 3 == 0 && lowerBound % 5 == 0) {
				System.out.print("CozaLoza ");
			} else if (lowerBound % 3 == 0 && lowerBound % 7 == 0) {
				System.out.print("CozaWoza ");
			} else if (lowerBound % 5 == 0 && lowerBound % 7 == 0) {
				System.out.print("LozaWoza ");
			} else if (lowerBound % 3 == 0 && lowerBound % 5 == 0 && lowerBound % 7 == 0) {
				System.out.print("CozaLozaWoza ");
			}
			System.out.print(lowerBound + " ");
			lowerBound++;
			stepCounter++;
			if (stepCounter == step) {
				stepCounter = 0;
				System.out.println(" ");
			}

		}

	}

}
