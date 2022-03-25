package main;

import java.util.Scanner;

public class Trace {

	static int trace(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] squareMatrix = new int[4][4];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < squareMatrix.length; i++) {
			for (int j = 0; j < squareMatrix[0].length; j++) {
				squareMatrix[i][j] = in.nextInt();
			}
		}
		in.close();

		System.out.println(trace(squareMatrix));
	}

}
