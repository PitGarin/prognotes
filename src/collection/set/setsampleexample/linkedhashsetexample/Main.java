package collection.set.setsampleexample.linkedhashsetexample;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// LinkedHashSet is ordered; в каком порядке добавляем элементы в таком
		// они и буLут извлекаться
		// extends HashSet
		//not sorted

		int[] array = { 1, 6, 5, 7, 8, 2, 12, 23 }, array2 = { 6, 1, 7, 8, 23, 2, 5, 12 };

		Set<Integer> linkedhashset = new LinkedHashSet<>(), linkedHashSet2 = new LinkedHashSet<>();

		for (int i = 0; i < array.length; i++) {
			linkedhashset.add(array[i]);
			linkedHashSet2.add(array2[i]);

		}
		System.out.println("LinkedHashSet: " + linkedhashset);
		System.out.println("LinkedHasSet2: " + linkedHashSet2);
		Iterator<Integer> iterator = linkedhashset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println(linkedhashset.equals(linkedHashSet2));
	}

}
