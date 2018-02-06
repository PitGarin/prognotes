package com.home.notes.package1;

import java.util.ArrayList;
import java.util.List;

public class Circle implements FigureArea {

	private double radius;
	List<Object> list = new ArrayList<>();

	@Override
	public double getArea(double... doubles) {
		for (double d : doubles) {

			list.add(d);
		}
		this.radius = (double) list.get(0);
		return Math.pow(radius, 2) * Math.PI;
	}

}
