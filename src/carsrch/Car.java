package carsrch;

public class Car {

	private String brand;
	private String model;
	private int price;

	public Car(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public boolean isSelectedBrand(String input) {
		return this.brand.equals(input);
	}

	public boolean isSelectedModel(String input) {
		return this.model.equals(input);
	}

}
