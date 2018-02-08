package com.home.notes.package4;

public class SumAndAvarage {

	private static int lowerBound;
	private static int upperBound;
	private static int sum;
	private static int avarage;

	public final int getAvarage() {
		return avarage;
	}

	private SumAndAvarage() {

	}

	public final int getLowerBound() {
		return lowerBound;
	}

	public final int getUpperBound() {
		return upperBound;
	}

	public final int getSum() {
		return sum;
	}

	public static void computeSum(int lowerBound, int upperBound) {
		SumAndAvarage.lowerBound = lowerBound;
		SumAndAvarage.upperBound = upperBound;
		do {
			sum += lowerBound;
			lowerBound++;
		} while (lowerBound <= upperBound);
		System.out.println("Sum is: " + sum);
	}

	public static void computeAvarage() {
		avarage = sum / upperBound;
		System.out.println("Avarage is: " + avarage);
	}
}
