package compare_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		List<Car> cars = new ArrayList<>();

		Car car = new Car("VW", 1990);
		Car car2 = new Car("AUDO", 1999);
		Car car3 = new Car("OPEL", 2001);
		Car car4 = new Car("DODGE", 1957);
		cars.add(car);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		// сортировка помощью интерфейса comparable
		// по имени в алфавитном порядке
		Collections.sort(cars);

		// print(cars);
		print2(cars);

		// создаем экземляры компараторов по одному разу чтобы в дальнейшем
		// использовать только ссылки на них и не плодить сущностиЫ
		CarYearComparator carYearComparator = new CarYearComparator();
		CarNameComparator carNameComparator = new CarNameComparator();

		// вариант сравнения объектов через comparator; return int (-1;0;1)
		System.out.println(carYearComparator.compare(car, car2));
		// сортировка с помощью созданого компаратора с нужными условиями
		// сортировки
		// в данном случае сортировка Integer по возрастанию
		Collections.sort(cars, carYearComparator);

		// print(cars);
		print2(cars);
		// при создании TreeSet можно указать comparator

		TreeSet<Car> carSet = new TreeSet<>(carNameComparator);
		carSet.add(car);
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);

		print2(carSet);
	}

	/*
	 * private static void print(List<Car> carList) { for (Car cars : carList) {
	 * System.out.println(String.format("%s - %s.", cars.getName(),
	 * cars.getYear())); } System.out.println(" "); }
	 */

	private static void print2(Collection<Car> collection) {
		Iterator<Car> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			System.out.println(car.getName() + " " + car.getYear());
		}
		System.out.println("//////////");
	}

}
