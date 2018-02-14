package carsrch.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import carsrch.Car;

public class SearchByModel extends Command {
	List<Car> carList;
	private int carQuantity = 0;

	public SearchByModel(String key, List<Car> carList) {
		super("Search by model");
		this.carList = carList;
		setKey(key);
	}

	@Override
	public void doAction() throws IOException {
		System.out.println("Input model to find.".toUpperCase());
		for (Car car : carList) {
			System.out.println(String.format("- %s.", car.getModel()));
		}
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bReader.readLine();
		for (Car car : carList) {
			if (car.isSelectedModel(input.toUpperCase())) {
				System.out.println(String.format("Model: %s, price: $%s.", car.getModel(), car.getPrice()));
				carQuantity++;
			}
		}
		System.out.println("Cars found by model: " + carQuantity);

	}

}
