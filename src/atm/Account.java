package atm;

public class Account {
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected int getMoney() {
		return money;
	}

	protected void setMoney(int money) {
		this.money = money;
	}

	private String name;
	private String password;
	private int money = 0;
}
