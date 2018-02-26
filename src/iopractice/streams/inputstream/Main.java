package iopractice.streams.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		// так же есть BufferedFileInputStream; работает быстрее

		FileInputStream fileInputStream = new FileInputStream("in.txt");
		byte[] bytes = new byte[fileInputStream.available()];// доступные байты

		while (fileInputStream.read(bytes) != -1) {// указывается из какого
													// массива читать

			for (int i = 0; i < bytes.length; i++) {
				System.out.println(bytes[i]);
			}
		}
		fileInputStream.close();

	}
}
// OutPutStream для записи байт; так же есть BufferedOutPutStream
// try with resources так же доступен