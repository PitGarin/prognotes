package ioexamples.bytesread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Start {

	public final static String PATH = "out.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileInputStream fileInputStream = new FileInputStream(PATH)) {
			int symbol;
			while ((symbol = fileInputStream.read()) != -1) {
				System.out.print((char) symbol);
			}
		}
	}

}
