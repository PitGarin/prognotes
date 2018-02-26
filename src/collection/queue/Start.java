package collection.queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Start {

	public static void main(String[] args) {

		// Queue<Car> carQ = new ArrayBlockingQueue<>(5);// очередь с
		// ограничением
		Queue<Car> carQ = new ArrayDeque<Car>();

		Car car1 = new Car("VW");
		Car car2 = new Car("AUDI");
		Car car3 = new Car("OPEL");
		Car car4 = new Car("DODGE");
		Car car5 = new Car("NISSAN");

		// carQ.add(car1); carQ.add(car2); carQ.add(car3); carQ.add(car4);
		// carQ.add(car5);
		//
		// System.out.println("Firts element without remove from queue: " +
		// carQ.element());
		// System.out.println("Firts element with remove from queue: " +
		// carQ.remove());

		Queue<Car> lifoQ = Collections.asLifoQueue((Deque<Car>) carQ);// LIFO
																		// зашел
																		// последний
																		// вышел
																		// первый
		lifoQ.add(car1);
		lifoQ.add(car2);
		lifoQ.add(car3);
		lifoQ.add(car4);
		lifoQ.add(car5);
		System.out.println("Firts element without remove from queue: " + lifoQ.element());

	}

}
