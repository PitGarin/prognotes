package oopractice.student;

public class Student {

	private String name;
	private String address;
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 30;

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];
		this.numCourses = 0;
	}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	public void printGrades() {
		System.out.print(name);
		for (int i = 0; i < numCourses; ++i) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}

	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; ++i) {
			sum += grades[i];
		}
		return (double) sum / numCourses;
	}

	/**
	 * @return the adress
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param adress
	 *            the adress to set
	 */
	public void setAddress(String adress) {
		this.address = adress;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " [" + "Adress is: " + address + "]";

	}

}
