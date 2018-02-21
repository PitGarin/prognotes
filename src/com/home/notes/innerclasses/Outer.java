package com.home.notes.innerclasses;

public class Outer {

	static String out = "out";
	private static String outerName = "OuterName";

	public Outer() {
	}

	public Outer(String name) {
		outerName = name;
		StaticNestedClass.nst = "nst" + name;
	}

	String getStnst() {
		return StaticNestedClass.stnst;

	}

	public static String getOuterName() {
		return outerName;
	}

	// СТАТИЧЕСКИЙ ВЛОЖЕННЫЙ КЛАСС
	static class StaticNestedClass {
		private String nestedName;
		static String nst = "nst";
		private static String stnst = " stnst";

		public StaticNestedClass(String name) {
			nestedName = name;
			outerName = "OUT" + nestedName;
		}

		public void setName(String name) {
			nestedName = name;
		}

		public String getName() {
			return nestedName;
		}

		public static String getOuterName() {
			return outerName;
		}

	}

}
