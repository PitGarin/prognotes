package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		boolean isRunning = true;
		ATM atm = new ATM();

		while (isRunning) {
			String command = showMenu();

			if (command.equals("3")) {
				isRunning = false;
			}

			if (command.equals("1")) {
				Account userAccount = atm.login();
				if (userAccount != null)
					atm.showActionMenu(userAccount);
			}

			if (command.equals("2")) {
				Account userAccount = atm.addAccount();
				atm.showActionMenu(userAccount);
			}
		}
	}

	private static String showMenu() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Hi, dear user!");
		System.out.println("if you want to log in, inssert '1'");
		System.out.println("if you want to register new account, inssert '2'");
		System.out.println("if you want to exit '3'");
		return reader.readLine();
	}
}