package ioexamples.byteswrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Start {

	public static final String PATH = "out.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String str = "Test string to use.";
		byte[] bArray = str.getBytes();

		try (FileOutputStream fileOutputStream = new FileOutputStream(PATH)) {
			for (byte b : bArray) {
				fileOutputStream.write(b);
			}
		}

	}

}
