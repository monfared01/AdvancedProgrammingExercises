package main;

import java.util.Scanner;

public class MostFrequent {

	static int mostFrequent(int arr[], int n) {

		// Sort the array
		BubbleSort.bubbleSort(arr);

		// find the max frequency using linear
		// traversal
		int max_count = 1, res = arr[0];
		int curr_count = 1;

		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1])
				curr_count++;
			else {
				if (curr_count > max_count) {
					max_count = curr_count;
					res = arr[i - 1];
				}
				curr_count = 1;
			}
		}

		// If last element is most frequent
		if (curr_count > max_count) {
			max_count = curr_count;
			res = arr[n - 1];
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();

		System.out.println(mostFrequent(arr, arr.length));

	}

}
