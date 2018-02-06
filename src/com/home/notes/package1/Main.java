package com.home.notes.package1;

public class Main {

	public static void main(String[] args) {

		// Квадрат
		FigureArea figureS = new Square();
		String squareName = Square.class.getSimpleName();
		double resultSquare = figureS.getArea(3, 3);

		// Круг
		FigureArea figureC = new Circle();
		String circleName = Circle.class.getSimpleName();
		double resultCircle = figureC.getArea(4.4);

		System.out.printf("Area of figure %s is %.1f \n", circleName, resultCircle);
		System.out.printf("Area of figure %s is %.1f", squareName, resultSquare);

	}

}
