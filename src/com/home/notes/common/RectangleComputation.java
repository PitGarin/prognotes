package com.home.notes.common;

public class RectangleComputation {

	public static void main(String[] args) {

		double length = 2.2;
		double widht = 4.6;
		double area;
		double perimeter;

		// Compute rectangle area
		area = length * widht;
		System.out.println("Area of the rectangle is: " + area);

		// Compute perimeter
		perimeter = 2 * (widht + length);
		System.out.println("Perimeter of the rectangle is: " + perimeter);
	}

}
