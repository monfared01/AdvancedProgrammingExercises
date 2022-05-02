package studentEx;

import java.util.Scanner;

public class CLI {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("students count ?  ");
		int sCount = in.nextInt();

		Student[] students = new Student[sCount];

		String topStudentName = null;
		float topStundentAvg = Float.MIN_VALUE;

		for (int i = 0; i < sCount; i++) {
			System.out.print("first name ?  ");
			String firstName = in.next();

			System.out.print("last name ?  ");
			String lastName = in.next();

			System.out.print("marks count ?  ");
			int marksCount = in.nextInt();

			float[] marks = new float[marksCount];
			for (int j = 0; j < marksCount; j++) {
				marks[j] = in.nextFloat();
			}

			students[i] = new Student(firstName, lastName, marks);
		}

		for (int i = 0; i < sCount; i++) {
			students[i].show();
			float avg = students[i].getAverage();
			System.out.println("   >>>>    Average : " + avg);
			if (avg > topStundentAvg) {
				topStudentName = students[i].getFirstName() + " " + students[i].getLastName();
				topStundentAvg = avg;
			}
		}
		System.out.println("top student : " + topStudentName + " Average : " + topStundentAvg);

	}
}

