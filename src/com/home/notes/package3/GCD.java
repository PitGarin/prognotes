package com.home.notes.package3;

public class GCD {

	public static void main(String[] args) {
		findGCD(24, 15);
	}

	public static void findGCD(int a, int b) {
		int temp = 0;
		// making a greater than b
		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}

		while (b != 0) {
			// gcd of b and a%b
			temp = a % b;
			// always make a greater than b
			a = b;
			b = temp;

		}
		System.out.println(a);// print to console
	}
}
