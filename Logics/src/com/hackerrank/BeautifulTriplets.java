package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulTriplets {

	public static void countTriplets(int d, int array[]) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {

			int j = Arrays.binarySearch(array, array[i] + d);
			if (j > i) {
				if (Arrays.binarySearch(array, array[i] + 2 * d) > j) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int d = scanner.nextInt();
		int array[] = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = scanner.nextInt();
		}
		countTriplets(d, array);
	}
}
