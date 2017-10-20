package com.git.logics;

import java.util.Arrays;

public class SumOfThreeArray {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(SumOfThreeArray.sum(new int[] { 3, 1, 7, 4, 5, 9, 10 }, 21)));

	}

	// Assumed elements are unique. and only one solution exists.
	public static int[] sum(int[] input, int sum) {

		for (int i = 0; i < input.length - 1; i++) {

			for (int j = i + 1; j < input.length - 1; j++) {

				if (!(input[i] + input[j] > sum)) {
					int third = sum - (input[i] + input[j]);

					if (third != input[i] && third != input[j] && Arrays.binarySearch(input, third) >= 0) {
						return new int[] { input[i], input[j], sum - (input[i] + input[j]) };
					}
				}
			}

		}
		return null;
	}
}
