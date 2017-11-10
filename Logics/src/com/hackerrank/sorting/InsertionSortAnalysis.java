package com.hackerrank.sorting;

import java.util.Scanner;

public class InsertionSortAnalysis {

	public static void analyse(int array[]) {
		long count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		for (int j = 0; j < tests; j++) {
			int num = scanner.nextInt();
			int array[] = new int[num];
			for (int i = 0; i < num; i++) {
				array[i] = scanner.nextInt();
			}
			analyse(array);
		}
		scanner.close();
	}

}
