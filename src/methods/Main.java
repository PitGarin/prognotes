package methods;

public class Main {

	public static void main(String[] args) {
		TestClass testClass = new TestClass();

		// вызов метода и передача возвращаемого значения как параметр(вызов по
		// типу матрешки)
		testClass.printString(testClass.getNewValue(testClass.getString()));

		// вызов метода и возврата результата в качестве return для другого
		// метода(типы должны совпадать)
		testClass.printString(testClass.returnMethod());

		// рекурсия
		testClass.doRecursive(0);

		// пример return
		System.out.println(testClass.returnExample(0));

	}

}
