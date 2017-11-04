package com.git.sorts;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

	public static void sort(int array[]) {
		int countArray[] = new int[100];
		int output[] = new int[array.length];
		Arrays.fill(countArray, 0);
		for (int i = 0; i < array.length; i++) {
			countArray[array[i]] += 1;
		}
		for (int i = 1; i < countArray.length; i++) {
			countArray[i] += countArray[i - 1];
		}

		for (int j = 0; j < output.length; j++) {

			output[--countArray[array[j]]] = array[j];

		}
		String string = Arrays.toString(output);
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
