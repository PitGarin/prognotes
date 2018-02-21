package com.home.notes.strings;

public class Strings1 {

	public static void main(String[] args) {
		char charArray[] = { 'a', 'b', 'c', 'd', 'f', 'g', '.' };
		String str = new String(charArray);
		System.out.println(str);

		StringBuilder stringBuilder = new StringBuilder(str);
		System.out.println(stringBuilder.substring(0, 3));
		StringBuilder str2 = new StringBuilder().append(str.substring(0, 4)).append(str.charAt(2))
				.append(str.toUpperCase());
		System.out.println(str2);
	}

}
