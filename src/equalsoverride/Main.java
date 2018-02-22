package equalsoverride;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("VW");
		Car car2 = new Car("VW");
		Car car3 = new Car("AUDI");
		Truck truck = new Truck();
		boolean eq;
		eq = car2.equals(car1);
		boolean al;
		al = car3.equals(truck);
		System.out.println(eq);
		System.out.println(al);

	}

}
