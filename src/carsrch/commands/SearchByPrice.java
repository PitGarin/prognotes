package carsrch.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import carsrch.Car;
import carsrch.enumerations.AUDI;
import carsrch.enumerations.DODGE;
import carsrch.enumerations.VW;

public class SearchByPrice extends Command {
	private List<Car> carList;

	public SearchByPrice(String key, List<Car> carList) {
		super("Search by price.");
		this.carList = carList;
		setKey(key);
	}

	@Override
	public void doAction() throws IOException {
		System.out.println("Input price to find.".toUpperCase());
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bReader.readLine();
		int price = Integer.parseInt(input);

		printPriceResult(price);

	}

	private void printPriceResult(int price) throws IOException {

		for (Car car : carList) {
			if (price == car.getPrice()) {
				System.out.println(String.format("Model: %s/Price: $%s.", car.getModel(), car.getPrice()));
			}
		}
	}

}
