package attempt.classes;

import java.util.List;

import attempt.StudentDataBase;

public class Professor {

	// просто лист для значений
	private List<Student> studentsList;

	public Professor(List<Student> studentsList) {
		super();
		this.studentsList = studentsList;
	}

	/*// конструктор получаюший ссылку на объект при создании
	public Professor(StudentDataBase studentDB) {
		this.studentsList = studentDB.getStudentsList();// заполняем лист
		// в
		// текущем классе
		// значениями из листа
		// класса
		// StudentDataBase с
		// помощью ссылки на
		// обьект класса
		// StudentDataBase и
		// метода
		// getStudentsList
	}*/

	// дальше работаем с листо класса Professor
	public void checkMark() {
		System.out.println("List of students with mark lower then 70.".toUpperCase());
		for (Student student : studentsList) {
			if (student.getMark() < 70) {
				System.out.println(String.format("Students name is: %s; Students mark is: %s", student.getName(),
						student.getMark()));
			} else {
				continue;
			}
		}
	}

}
