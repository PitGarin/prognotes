package carsrch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import carsrch.commands.Command;
import carsrch.commands.SearchByBrand;
import carsrch.commands.SearchByModel;
import carsrch.commands.SearchByPrice;
import carsrch.enumerations.AUDI;
import carsrch.enumerations.DODGE;
import carsrch.enumerations.VW;

public class DataBase {

	List<Command> cmdList = new ArrayList<>();
	List<Car> carList = new ArrayList<>();

	public DataBase() {

		cmdList.add(new SearchByBrand("1", carList));
		cmdList.add(new SearchByModel("2", carList));
		cmdList.add(new SearchByPrice("3", carList));

		createCar();

	}

	private void createCar() {
		for (int i = 0; i < VW.values().length; i++) {
			carList.add(new Car("VW", VW.values()[i].toString(), ((int) (Math.random() * 300) + 800)));
		}
		for (int i = 0; i < AUDI.values().length; i++) {
			carList.add(new Car("AUDI", AUDI.values()[i].toString(), ((int) (Math.random() * 200) + 500)));
		}
		for (int i = 0; i < DODGE.values().length; i++) {
			carList.add(new Car("DODGE", DODGE.values()[i].toString(), ((int) (Math.random() * 1200) + 2700)));
		}
	}

	public void execute() throws IOException {

		System.out.println("Choose from offered options. \n".toUpperCase());

		for (Command command : cmdList) {
			command.printMenu();
		}

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bufferedReader.readLine();
		for (Command command : cmdList) {
			if (command.isValid(input)) {
				command.doAction();
			} /*
				 * else { return; }
				 */

		}

	}

}
