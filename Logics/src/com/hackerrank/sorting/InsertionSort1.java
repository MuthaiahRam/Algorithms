package com.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort1 {

	public static void insertIntoSorted(int array[]) {
		int temp = array[array.length - 1];
		int i = array.length - 2;
		String string = "";
		while (i>=0 && temp < array[i]) {

			array[i + 1] = array[i];
			string = Arrays.toString(array);
			System.out.println(string.substring(1, string.length() - 1).replace(",", ""));
			i--;
		}
		if (i != array.length - 2) {
			array[i + 1] = temp;
		}
		string = Arrays.toString(array);
		System.out.println(string.substring(1, string.length() - 1).replace(",", ""));

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		insertIntoSorted(array);

	}

}
