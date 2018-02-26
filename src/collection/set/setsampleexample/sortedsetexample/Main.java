package collection.set.setsampleexample.sortedsetexample;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		SortedSet<Integer> set = new TreeSet<>();

		int[] array = { 0, 2, 3, 6, 4, 3, 5, 1, 8, 7, 9 };
		for (int i : array) {
			set.add(i);
		}
		System.out.println(set);
		System.out.println("First element of collection: " + set.first());
		System.out.println("Last element of collection: " + set.last());

		SortedSet<Integer> subset = set.subSet(0, 4);
		System.out.println(subset);
		System.out.println("First element of collection: " + subset.first());
		System.out.println("Last element of collection: " + subset.last());

	}

}
