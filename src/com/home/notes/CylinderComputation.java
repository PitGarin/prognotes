package com.home.notes;

public class CylinderComputation {

	public static void main(String[] args) {

		double radius = 3.1;
		double height = 11.1;
		final double PI = 3.14;
		double surfaceArea;
		double volume;

		// Compute the surface area
		surfaceArea = (2 * PI * (radius * radius)) + (2 * PI * radius * height);
		System.out.println("Surface area is: " + surfaceArea);

		// Compute the volume

		volume = PI * (radius * radius) * height;
		System.out.println("The volume is: " + volume);
	}

}
