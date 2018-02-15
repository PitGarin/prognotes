package carsrch.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import carsrch.Car;

public class SearchByBrand extends Command {
	List<Car> carList;
	private int carQuantity = 0;

	public SearchByBrand(String key, List<Car> carList) {
		super("Search by brand.");
		this.carList = carList;
		setKey(key);
	}

	@Override
	public void doAction() throws IOException {

		System.out.println("Input brand to find.".toUpperCase());

		printBrand();

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bReader.readLine();

		for (Car car : carList) {
			if (car.isSelectedBrand(input.toUpperCase())) {
				System.out.println(String.format("Brand: %s, model: %s, price: $%s.", car.getBrand(), car.getModel(),
						car.getPrice()));
				carQuantity++;
			} /*
				 * else { return; }
				 */
		}
		System.out.println("Cars found by brand: " + carQuantity);
	}

	private void printBrand() {
		System.out.println("- VW");
		System.out.println("- DODGE");
		System.out.println("- AUDI");
	}
}
