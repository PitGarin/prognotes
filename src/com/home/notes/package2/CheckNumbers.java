package com.home.notes.package2;

public final class CheckNumbers {

	public static int isPerfect(int number) {

		int sum = 0;
		// check is perfect number

		for (int index = 1; index < number; index++) {
			if (number % index == 0) {
				sum += index;
				// check and remove unnecessary iterations
				if (sum == number) {
					break;
				}
			}
		}

		System.out.println(number == sum ? "Number is perfect." : "Number isn't perfect.");

		return sum;

	}

	private CheckNumbers() {
	}

}
