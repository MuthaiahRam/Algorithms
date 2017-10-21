package com.hackerrank;

import java.util.Scanner;

public class MiniMaxSum {

	static void calculateMiniMax(int array[]) {
		int n = 5;
		long min = array[0], max = array[0], sum = array[0];
		while (n > 1) {
			sum += array[--n];
			min = (min > array[n]) ? array[n] : min;
			max = (max < array[n]) ? array[n] : max;
		}

		System.out.print(sum - max + " ");
		System.out.println(sum - min);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		calculateMiniMax(arr);
	}
}
