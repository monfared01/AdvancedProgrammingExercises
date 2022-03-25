package main;

import java.util.Scanner;

public class StudentScores {

	static float avg(float[] scores) {
		float sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum / scores.length;
	}

	static float[] getColumn(float[][] scores, int index) {
		float[] column = new float[scores.length];
		for (int i = 0; i < column.length; i++) {
			column[i] = scores[i][index];
		}
		return column;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float[][] scores = new float[4][5];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				scores[i][j] = in.nextFloat();
			}
		}
		int key = in.nextInt();
		in.close();
		switch (key) {
		case 1: {
			float max = 0;
			int info = 0;
			for (int i = 0; i < scores.length; i++) {
				float _avg = avg(scores[i]);
				if (_avg > max) {
					info = i;
					max = _avg;
				}
			}
			System.out.println(info);
			break;
		}
		case 2: {
			float max = 0;
			int info = 0;
			for (int i = 0; i < scores[0].length; i++) {
				float _avg = avg(getColumn(scores, i));
				if (_avg > max) {
					info = i;
					max = _avg;
				}
			}
			System.out.println(info);
			break;
		}
		default:
			break;
		}
	}

}
