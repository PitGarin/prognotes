package methods;

public class TestClass {

	public String getNewValue(String string) {
		return string + " and new value";

	}

	public String getString() {
		return "new string";
	}

	public void printString(String value) {
		System.out.println("value = " + value);
	}

	public String returnMethod() {
		return getNewValue("new value");

	}

	public int doRecursive(int var) {
		var += 1;
		if (var == 10) {
			return var;
		}
		System.out.print(var + " ");
		return doRecursive(var);

	}

	public String returnExample(int args) {
		System.out.println(" ");
		// досрочный выход из метода при выполнении определенного условия
		if (args == 0) {
			return "error";
		}
		if (args < 0) {
			return "Negative";
		}
		return "unknown";

	}

}
