package com.git.sorts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(InsertionSort.insertionSort(new int[] { 3, 1, 5, 6 })));
	}

	public static int[] insertionSort(int[] input) {
		int temp, swapIndex;
		for (int i = 1; i < input.length; i++) {
			swapIndex = -1;
			temp = input[i];

			// we can also club the for and if cond., together in for ie swap
			// happens only when < or >
			// we can use j direclty without swapIndex.
			// since we break with else, we can combine the conditions to exit
			// for.
			for (int j = i; j > 0; j--) {

				if (temp < input[j - 1]) {
					input[j] = input[j - 1];
					swapIndex = j - 1;

				} else {
					break;
				}

			}
			if (swapIndex != -1)
				input[swapIndex] = temp;

		}
		return input;
	}

}
