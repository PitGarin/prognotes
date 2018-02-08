package com.home.notes.common;

import javax.swing.JOptionPane;

/*
 * Input via a Dialog box
 */

public class JOptionPaneTest {

	public static void main(String[] args) {

		String radiusStr;
		double radius, area;
		// Read input String from dialog box

		radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle");
		radius = Double.parseDouble(radiusStr); // Convert String to double
		area = radius * radius * Math.PI;
		System.out.println("The area is " + area);

	}

}
