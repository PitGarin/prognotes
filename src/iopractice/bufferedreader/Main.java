package iopractice.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("in.txt"));
		Scanner scanner = new Scanner(read);
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

}
