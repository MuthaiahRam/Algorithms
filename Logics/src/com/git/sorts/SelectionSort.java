package com.git.sorts;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		SelectionSort.selectionSort(array);

		//System.out.println(Arrays.toString(SelectionSort.selectionSort(new int[] { 2, 5, 3, 1 })));
	}

	public static int[] selectionSort(int[] input) {
		int indexOfMinimum;
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			indexOfMinimum = i;
			int j;
			for (j = i + 1; j <= input.length - 1; j++) {
				if (input[j] < input[indexOfMinimum]) {
					indexOfMinimum = j;

				}

			}

			if (i != indexOfMinimum) {

				int minimum = input[indexOfMinimum];
				input[indexOfMinimum] = input[i];
				input[i] = minimum;
				count++;
			} else {
				break;
			}

		}
		System.out.println(count);
		return input;
	}
}
