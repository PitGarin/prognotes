package compare_comparator;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		// чтобы работать с числами для начала нужно преобразовать в тип Integer
		Integer year1 = new Integer(o1.getYear());
		Integer year2 = new Integer(o2.getYear());
		return year1.compareTo(year2);
	}

}
