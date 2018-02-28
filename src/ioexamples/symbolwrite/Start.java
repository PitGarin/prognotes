package ioexamples.symbolwrite;

import java.io.FileWriter;
import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {

		String str = "Hello test!!!";
		char[] chars = new char[str.length()];
		str.getChars(0, str.length(), chars, 0);// gets bytes from String and
												// writes to char array

		try (FileWriter fileWriter = new FileWriter("out.txt")) {
			for (char c : chars) {
				fileWriter.write(c);                    
			}
		}        

	}

}
      

   