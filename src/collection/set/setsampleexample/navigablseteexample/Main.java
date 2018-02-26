package collection.set.setsampleexample.navigablseteexample;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		int[] array = { 0, 1, 2, 3, 4, 5 };

		NavigableSet<Integer> navigableSet = new TreeSet<>();

		for (int i : array) {
			navigableSet.add(i);
		}
		System.out.println("lower(): " + navigableSet.lower(navigableSet.size()));
		System.out.println("higher(): " + navigableSet.higher(2));
		System.out.println("floor(): " + navigableSet.floor(5));
		System.out.println("ceiling(): " + navigableSet.ceiling(4));

		Iterator<Integer> it = navigableSet.descendingIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n" + navigableSet.descendingSet());// чтобы не
																// создавать
		// итератор мождно
		// юзать такой метод
	}

}
