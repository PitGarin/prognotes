package oopractice.acc;

public class Account {

	public static final double DEFAUL_BALANCE = 0.0;

	private int accountNumber;
	private double balance;

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = DEFAUL_BALANCE;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	public void credit(double amount) {
		this.balance += amount;
	}

	public void debit(double amount) {
		if (balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("amount withdraw exceed current balance");
		}
	}

	@Override
	public String toString() {
		return String.format("A/C no:%d, Balance=%.2f", accountNumber, balance);
	}

}
