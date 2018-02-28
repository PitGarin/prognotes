package ioexamples.file;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		String path = "E:/sample/sample.txt";
		File file = new File(path);
		System.out.println("name: " + file.getName());
		System.out.println("path: " + file.getPath());
		System.out.println("absolute path: " + file.getAbsolutePath());
		System.out.println("folder: " + file.getParent());
		System.out.println("length:" + file.length());
		System.out.println("last modified: " + file.lastModified());// try to
																	// convert
																	// to more
																	// readable
																	// format

		// end other methods
		System.out.println("Total space: " + CapacityFormatter.toGyg(file.getTotalSpace()) + "Gb.");
		System.out.println("Free space: " + CapacityFormatter.toGyg(file.getFreeSpace()) + "Gb.");
	}

	public static class CapacityFormatter {

		public static long toGyg(long capacity) {
			return capacity / (long) Math.pow(10, 9);

		}
	}

}
