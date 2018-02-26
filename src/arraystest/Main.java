package arraystest;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		char[][] array = new char[10][];
		for (int i = 0; i < array.length; i++) {
			array[i] = new char[i + 1];
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = '*';
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}

		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * (25 - 10) + 10);
			System.out.print(ar[i] + " ");
		}

		System.out.println("");
		Arrays.sort(ar);
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println("");

		Integer[] wraped = new Integer[10];
		for (int i = 0; i < wraped.length; i++) {
			wraped[i] = (int) (Math.random() * (25 - 10) + 10);
			System.out.print(wraped[i] + " ");
		}
		System.out.println("");

		Arrays.sort(wraped, Collections.reverseOrder());
		for (Integer integer : wraped) {
			System.out.print(integer + " ");
		}
	}

}
