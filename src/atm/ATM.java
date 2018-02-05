package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ATM {
	ArrayList<Account> accounts = new ArrayList<Account>();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	protected void showActionMenu(Account account) throws IOException {
		System.out.println("if you want to put cash, inssert '1'");
		System.out.println("if you want to get cash, insert '2'");
		System.out.println("if you want to get balanse, insert '3'");
		System.out.println("if you want to exit '4'");
		run(account, reader.readLine());
	}

	protected void run(Account account, String action) throws IOException {
		if (action.equals("1"))
			putCash(account);
		if (action.equals("2"))
			getCash(account);
		if (action.equals("3"))
			getBalance(account);
		if (!action.equals("4"))
			showActionMenu(account);
	}

	protected Account login() throws IOException {
		System.out.println("Please, enter your id");
		String id = reader.readLine();
		Account account = null;

		try {
			account = accounts.get(Integer.parseInt(id));
		} catch (Exception e) {
			System.out.println("Sorry, such account was not found");
			return null;
		}

		System.out.println("Please, enter your password");
		String password = reader.readLine();
		if (!account.getPassword().equals(password)) {
			System.out.println("Sorry, wrong password");
			return null;
		}
		return account;
	}

	protected Account addAccount() throws IOException {
		Account account = new Account();
		System.out.println("Please, enter your name");
		account.setName(reader.readLine());
		System.out.println("Please, enter your password");
		account.setPassword(reader.readLine());
		accounts.add(account);

		System.out.println("Thanks, " + account.getName());
		System.out.println("Your id: " + (accounts.size() - 1));
		System.out.println("Your password is: " + account.getPassword());
		return account;
	}

	protected void getBalance(Account account) throws IOException {
		System.out.println("Your balanse is: " + account.getMoney());
	}

	protected void getCash(Account account) throws IOException {
		System.out.println("Please, enter sum");
		int sum = parseSum(reader.readLine());

		if (!checkSum(sum)) {
			System.out.println("Sorry, wrong sum");
			return;
		}

		int money = account.getMoney();

		if (money < sum) {
			System.out.println("Sorry, wrong sum");
			return;
		}

		success(account, money - sum);
	}

	protected void putCash(Account account) throws IOException {
		System.out.println("Please, enter sum");
		int sum = parseSum(reader.readLine());

		if (!checkSum(sum)) {
			System.out.println("Sorry, wrong sum");
			return;
		}

		success(account, account.getMoney() + sum);

	}

	private Integer parseSum(String value) {
		int summ;
		try {
			summ = Integer.parseInt(value);
		} catch (Exception e) {
			return -1;
		}

		return summ;
	}

	private Boolean checkSum(int sum) {
		return sum % 5 == 0;
	}

	private void success(Account account, int summ) throws IOException {
		account.setMoney(summ);
		getBalance(account);
	}
}
