package main;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		for (int i = 0; i < arr.length; i++) {
			boolean flage = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flage = false;
					break;
				}
			}
			if(flage == true)
				System.out.println(arr[i]);
		}
	}

}
