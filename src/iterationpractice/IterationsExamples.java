package iterationpractice;

public class IterationsExamples {

	public static void main(String[] args) {

		// standart iteration
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println(" ");
		// reverse iteration
		for (int i = 10; i > 0; i--) {
			System.out.println("i = " + i);
		}
		System.out.println(" ");
		// step +2
		for (int i = 0; i < 10; i += 2) {
			System.out.println("i = " + i);
		}
		System.out.println(" ");

		// iternal eteration
		// var can be double or other type;
		// step can be different than int
		for (double i = 0; i < 2;) {
			System.out.println(i);
		}
		System.out.println(" ");

		// break operator; continue operator; while; do while;

	}

}
