package attempt;

import java.util.List;

import attempt.classes.Professor;
import attempt.classes.Student;
import attempt.classes.Test;

public class Main {

	public static void main(String[] args) {

		// create and fill dataB base
		StudentDataBase studentDB = new StudentDataBase();

		Professor professor = new Professor(studentDB.getStudentsList());
		professor.checkMark();

		Test test = new Test(studentDB);
		test.activitiesWithList();

		studentDB.printList();
	}

}
