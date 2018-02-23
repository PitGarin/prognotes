package equalsoverride;

public class Car {

	private String name;
	// private String fuelType;

	public Car(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
}
