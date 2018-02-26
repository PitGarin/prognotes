package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import collection.queue.Car;

public class Start {

	public static void main(String[] args) {

		Map<String, Car> hashMap = new HashMap<>();

		hashMap.put("key1", new Car("VW"));
		hashMap.put("key2", new Car("AUDI"));
		hashMap.put("key3", new Car("OPEL"));
		hashMap.put("dodge", new Car("DODGE"));
		hashMap.put("key5", new Car("NISSAN"));

		iterate(hashMap);// порядок вставки по ключам не сохраняется при печати

		// sorted
		// нативная сортировка по алфавиту
		TreeMap<String, Car> treeMap = new TreeMap<>();

		treeMap.put("key1", new Car("VW"));
		treeMap.put("key2", new Car("AUDI"));
		treeMap.put("key3", new Car("OPEL"));
		treeMap.put("dodge", new Car("DODGE"));
		treeMap.put("key5", new Car("NISSAN"));
		treeMap.put("key5", new Car("NEWNISSAN"));// при дублированиии ключа
													// происходит замена

		iterate(treeMap);

		// порядок вставки сохраняется
		LinkedHashMap<String, Car> carLinkedHashMap = new LinkedHashMap<>();

		carLinkedHashMap.put("dodge", new Car("DODGE"));
		carLinkedHashMap.put("key1", new Car("VW"));
		carLinkedHashMap.put("key2", new Car("AUDI"));
		carLinkedHashMap.put("key3", new Car("OPEL"));
		carLinkedHashMap.put("key5", new Car("NISSAN"));

		iterate(carLinkedHashMap);

	}

	public static void iterate(Map<String, Car> map) {

		Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Car> carEntry = iterator.next();

			System.out.printf("Key - %s; Value - %s. \n", carEntry.getKey(), carEntry.getValue().getName());
		}
		System.out.println(" ");
	}

}
