package iopractice.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("in.txt");

		// one way to read from file;
		int i = 0;
		while ((i = reader.read()) != -1) {
			System.out.print((char) i);
		}
		System.out.println(" ");
		// another way to read from file
		char[] array = new char[50];
		while (reader.read(array) != -1) {
			for (int j = 0; j < array.length; j++) {
				if (Character.isAlphabetic(array[j])) {
					System.out.print(array[j]);
				}
			}

		}

	}

}
