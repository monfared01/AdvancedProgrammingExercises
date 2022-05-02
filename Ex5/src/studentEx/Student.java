package studentEx;

public class Student {
	private String firstName, lastName;
	private float[] marks;

	public Student(String firstName, String lastName, float[] marks) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float[] getMarks() {
		return marks;
	}

	public void setMarks(float[] marks) {
		this.marks = marks;
	}
	
	public float getAverage() {
		float sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		return sum / marks.length;
	}
	
	public void show() {
		String tmp = this.firstName + " " + this.lastName + " : ";
		for (int i = 0; i < marks.length; i++) {
			tmp += marks[i] + " ";
		}
		System.out.println(tmp);
	}

}
