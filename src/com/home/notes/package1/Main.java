package com.home.notes.package1;

public class Main {

	public static void main(String[] args) {

		// Квадрат
		FigureArea figureS = new Square(3.4, 4.3);
		figureS.getFigureArea();

		// Круг
		FigureArea figureC = new Circle(2.3);
		figureC.getFigureArea();
	}

}
