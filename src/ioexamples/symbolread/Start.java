package ioexamples.symbolread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Start {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileReader fileReader = new FileReader("out.txt")) {
			int symbol;
			while ((symbol = fileReader.read()) != -1) {
				System.out.print((char) symbol);
			}
		}

	}

}
