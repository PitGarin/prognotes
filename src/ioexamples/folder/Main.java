package ioexamples.folder;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		String path = "src/backup";
		
		File directory = new File(path);
		if (directory.isDirectory()) {
			String[] content = directory.list();
			if (content != null) {
				for (String string : content) {
					File file = new File(path + "/" + string);
					System.out.println(file.isDirectory() ? (string + " is directory ") : (string + " is file "));
				}
			}
		}

		makeDir(directory);

	}

	private static void makeDir(File directory) {
		if (!directory.exists()) {
			System.out.println(directory.mkdir() ? "Success" : "Failed");
		} else {
			System.out.println("Already exist.");
		}
	}

}
