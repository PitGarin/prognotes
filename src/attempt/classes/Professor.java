package attempt.classes;

import java.util.List;

public class Professor {
	
	List<Student> studentsList;

	public void checkMark() {
		for (Student student : studentsList) {
			System.out.println(
					String.format("Students name is: %s; Students mark is: %s", student.getName(), student.getMark()));
		}
	}

}
