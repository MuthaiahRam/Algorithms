package com.hackerrank.sorting;

import java.util.Scanner;

public class InsertionSort2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		insertionSort(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
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
			printArray(input);

		}
		return input;
	}
}
