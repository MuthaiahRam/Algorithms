package com.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {

	public static void findMedian(int array[]) {
		Arrays.sort(array);
		System.out.println(array[array.length / 2]);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int array[] = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = scanner.nextInt();
		}
		findMedian(array);

	}
}
