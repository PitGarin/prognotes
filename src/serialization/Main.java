package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serialization.anotherexmpl.UserChild;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		UserChild user = new UserChild();
		user.setLifilevel(55);
		user.setStaticField(10);
		Sword sword = new Sword();
		sword.lvl = 5;
		user.sword = sword;
		user.setChildLvl(76);

		// сериализация
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("userSave"));
		objectOutputStream.writeObject(user);
		objectOutputStream.close();

		user.setLifilevel(95);
		user.setStaticField(110);

		// десереализация
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("userSave"));
		UserChild loadedUser = (UserChild) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(loadedUser.getLifilevel());
		System.out.println(loadedUser.getStaticField());
		System.out.println(loadedUser.sword.lvl);
		System.out.println(loadedUser.getChildLvl());

	}

}
