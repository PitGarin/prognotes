package serialization.anotherexmpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

	public static final String PATH = "test.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		serialize();
		deSerealize();
	}

	private static void serialize() throws FileNotFoundException, IOException {
		SerializableClass serializableClass = new SerializableClass(SerializableClass.class.getSimpleName(), 25);

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
			objectOutputStream.writeObject(serializableClass);
		}
		serializableClass.setSize(123);
	}

	private static void deSerealize() throws FileNotFoundException, IOException, ClassNotFoundException {

		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATH))) {
			SerializableClass serializableClass = (SerializableClass) objectInputStream.readObject();
			System.out.println(serializableClass.getSize());
			System.out.println(serializableClass.getTitle());
		}
	}
}

class SerializableClass implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	private int size;

	public SerializableClass(String title, int size) {
		super();
		this.title = title;
		this.size = size;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

}