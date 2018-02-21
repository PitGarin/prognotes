package attempt;

import java.util.ArrayList;
import java.util.List;

import attempt.classes.Professor;
import attempt.classes.Student;
import attempt.enums.Name;
import carsrch.commands.SearchByBrand;

public class StudentDataBase {

	private List<Student> studentsList;// просто переменная хранящая значения

	// просто конструктор
	public StudentDataBase() {
		studentsList.size();
		fillDataBase();
	}

	// метод позволяющий получить все что хранится в листе
	public List<Student> getStudentsList() {
		return studentsList;
	}

	// метод заполняющий лист значениями
	// можем сделать его приватным так как он вызывается в конструкторе
	private List<Student> fillDataBase() {
		if (studentsList == null) {
			studentsList = new ArrayList<>();
			for (int i = 0; i < Name.values().length; i++) {
				studentsList.add(new Student((int) (Math.random() * 100 + 1), Name.values()[i].toString()));
			}
		}
		return studentsList;
	}

	public void printList() {
		for (Student student : studentsList) {
			if (!(student == null)) {
				System.out.println(String.format("Students name is: %s; Students mark is: %s", student.getName(),
						student.getMark()));
			}
		}
	}

}
