package com.home.notes.package1;

public class Circle implements FigureArea {

	private double radius;
	private double circleArea;

	public Circle(double radius) {
		this.radius = radius;
	}

	public final double getRadius() {
		return radius;
	}

	public final double getCircleArea() {
		return circleArea;
	}

	@Override
	public void getFigureArea() {

		this.circleArea = Math.pow(this.radius, 2) * Math.PI;
		System.out.println(String.format("Circle area is %.2f", this.circleArea));
	}

}
