package oopractice.test;

public class Main {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.setAge(5);
		cat.getAge();
		System.out.println(cat);
		for (int i = 0; i < cat.getAge(); i++) {
			cat.grow();
		}

		System.out.println(cat);

	}

}
