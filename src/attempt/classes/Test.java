package attempt.classes;

import java.util.List;

import attempt.StudentDataBase;

public class Test {

	List<Student> testList;

	public Test(StudentDataBase studentDB) {
		this.testList = studentDB.getStudentsList();

	}

	public void activitiesWithList() {
		System.out.println("List after remove < 10".toUpperCase());
		for (int i = 0; i < testList.size(); i++) {
			if (testList.get(i).getMark() < 10) {
				testList.remove(i);
			}
		}
	}

}
