package oopractice.test;

public class Cat {
	private int age;

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public Cat grow() {
		age++;
		if (age > 10) {
			System.out.println("Cat is dead.");
			System.exit(1);
		}
		return this;
	}

	@Override
	public String toString() {
		return "Cat age is : " + age;
	}

}
