package attempt;

import java.util.ArrayList;
import java.util.List;

import attempt.classes.Professor;
import attempt.classes.Student;
import attempt.enums.Name;

public class StudentDataBase {

	List<Student> studentsList;

	public List<Student> fillDataBase() {
		if (studentsList == null) {
			studentsList = new ArrayList<>();
			for (int i = 0; i < Name.values().length; i++) {
				studentsList.add(new Student((int) (Math.random() * 100 + 1), Name.values()[i].toString()));
			}
		}
		return studentsList;
	}

}
