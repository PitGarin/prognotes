package collection.set.setsampleexample.treesetexample;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// TreeSet хранит обьекты в упорядоченом виде (без дубликатов)
		// TreeSet самы медленный из за постоянной сортировки элементов
		// sorted

		int[] array = { 0, 1, 2, 3, 4, 5, 3, 1, 5, 2, 7, 9 };

		Set<Integer> treeSet = new TreeSet<>();
		for (int i : array) {
			treeSet.add(i);
		}

		for (Integer integer : treeSet) {
			System.out.print(integer + " ");
		}
		System.out.println("");
		System.out.println("TreeSet current size: " + treeSet.size());
		for (int i = 0; i < array.length / 2; i++) {
			treeSet.remove(i);
		}
		System.out.println("TreeSet current size: " + treeSet.size() + "\n" + treeSet.toString());
	}

}
