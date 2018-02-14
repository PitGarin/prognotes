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

	List<Car> carList;

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

		// метод
		printPriceResult(price);

	}

	private void printPriceResult(int price) {
		if (price > 300 && price < 800) {
			for (int i = 0; i < VW.values().length; i++) {
				System.out.println(String.format("Model: %s.", VW.values()[i]));
			}
		}
		if (price > 200 && price < 500) {
			for (int i = 0; i < AUDI.values().length; i++) {
				System.out.println(String.format("Model: %s.", AUDI.values()[i]));
			}
		}
		if (price > 1200 && price < 2700) {
			for (int i = 0; i < DODGE.values().length; i++) {
				System.out.println(String.format("Model: %s.", DODGE.values()[i]));
			}
		}
	}
}
