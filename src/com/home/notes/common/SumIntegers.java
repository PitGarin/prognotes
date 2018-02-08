package com.home.notes.common;

public class SumIntegers {

	public static void main(String[] args) {

		int low = 1;
		int up = 1000;
		int sum = 0;
		while (low <= up) {
			if (low % 13 == 0 || low % 15 == 0 || low % 17 == 0 && low % 30 != 0) {
				sum += low;
			}
			low++;
		}
		System.out.println(sum);
	}

}
