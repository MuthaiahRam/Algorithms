package com.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort1 {

	public static void sort(int array[]) {
		int countArray[] = new int[100];
		Arrays.fill(countArray, 0);
		for (int i = 0; i < array.length; i++) {
			countArray[array[i]] += 1;
		}
		String string = Arrays.toString(countArray);
		System.out.println(string.substring(1, string.length() - 1).replace(",", ""));

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int array[] = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		sort(array);

	}
	
	
}
