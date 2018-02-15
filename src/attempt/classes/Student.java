package attempt.classes;

public class Student {

	private String name;
	private int mark;

	public Student(int mark, String name) {
		this.name = name;

		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}

}
