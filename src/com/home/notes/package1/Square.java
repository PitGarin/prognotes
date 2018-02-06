package com.home.notes.package1;

import java.util.ArrayList;
import java.util.List;

public class Square implements FigureArea {

	private double height;
	private double width;
	List<Object> list = new ArrayList<>();

	@Override
	public double getArea(double... doubles) {
		for (double d : doubles) {

			list.add(d);
		}
		this.height = (double) list.get(0);
		this.width = (double) list.get(1);

		return this.height * this.width;
	}

}
