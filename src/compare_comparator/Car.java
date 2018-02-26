package compare_comparator;

public class Car implements Comparable<Car> {

	private String name;
	private int year;

	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	//
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj) {
	// return true;
	// }
	// if (obj == null || getClass() != obj.getClass()) {
	// return false;
	// }
	// Car car = (Car) obj;
	// if (!this.name.equals(car.name))
	// return false;
	// return true;
	// }
	//
	// @Override
	// public int hashCode() {
	// return name.hashCode();
	// }

	@Override
	public int compareTo(Car car) {// реализаци comparable сортировка по
									// алфавиту
		return this.name.compareTo(car.getName());
	}
}
