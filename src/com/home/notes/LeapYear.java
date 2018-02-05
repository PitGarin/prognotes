package com.home.notes;

public class LeapYear {

	public static void main(String[] args) {

		int yearFirst = 1;
		int yearLast = 2018;
		int yearCounter = 0;

		while (yearFirst <= yearLast) {
			if (yearFirst % 4 == 0 && yearFirst % 100 != 0 || yearFirst % 400 == 0) {

				yearCounter++;
			}
			yearFirst++;
		}
		System.out.println("Quantity of leap years: " + yearCounter);
	}

}
