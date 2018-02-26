package collection.queue;

public class Car implements Comparable<Car> {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Car car = (Car) obj;
		if (!this.name.equals(car.name))
			return false;
		return true;

	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public int compareTo(Car car) {
		return this.name.compareTo(car.getName());
	}

	@Override
	public String toString() {
		return "Car name  is: " + name;
	}

}
