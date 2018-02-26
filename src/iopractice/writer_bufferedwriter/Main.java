package iopractice.writer_bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		// BufferedWriter has method newLine();
		// try with resources; autoclosable;
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("in.txt"));) {

			writer.write("- There is something i want to tell ya...");
			writer.newLine();
			writer.write("- Fuck you, Jimmy!");
			writer.newLine();
			writer.write("- Sad.");
		}

	}

}
