package oopractice.student;

public class Main {

	public static void main(String[] args) {

		Student student = new Student("Tan Ah Teck", "1 Happy Ave");
		System.out.println(student);

		student.setAddress("8 Kg Java");
		System.out.println(student);

		System.out.println(student.getName());
		System.out.println(student.getAddress());

		student.addCourseGrade("IM101", 89);
		student.addCourseGrade("IM102", 57);
		student.addCourseGrade("IM103", 96);
		student.printGrades();
		System.out.printf("The average grade is %.2f%n", student.getAverageGrade());
	}

}
