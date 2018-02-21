package oopractice.time;

public class Main {

	public static void main(String[] args) {

		Time time = new Time();
		try {
			time.setTime(5, 45, 12);
		} catch (IllegalArgumentException exc) {
			exc.printStackTrace();
		}
		System.out.println(time);

	}

}
