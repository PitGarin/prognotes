package collection.set.setsampleexample.hashsetexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// в основе HashSet лежит HashMap
		// not ordered
		// not sorted
		// самый быстрый
		int[] array = { 1, 7, 3, 6, 9, 2, 9 };
		Set<Integer> dataSet = new HashSet<>();

		for (int i = 0; i < array.length; i++) {
			dataSet.add(array[i]);
		}
		
		Iterator<Integer> iter = dataSet.iterator();
		while (iter.hasNext()) {
			Integer integer = iter.next();
			System.out.print(integer + " ");
		}
		System.out.println(" ");
		System.out.println(dataSet.toString());
	}

}
