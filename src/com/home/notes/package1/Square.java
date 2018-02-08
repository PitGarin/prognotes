package com.home.notes.package1;

public class Square implements FigureArea {

	private double height;
	private double width;
	private double squareArea;

	public Square(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public final double getfArea() {
		return squareArea;
	}

	public final double getHeight() {
		return height;
	}

	public final double getWidth() {
		return width;
	}

	@Override
	public void getFigureArea() {

		this.squareArea = this.height * this.width;
		System.out.println(String.format("Square area is %.2f", this.squareArea));
	}

}
