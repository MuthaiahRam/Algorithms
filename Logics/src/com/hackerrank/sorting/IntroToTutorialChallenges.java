package com.hackerrank.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int arraySize = scanner.nextInt();
		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		findIndex(array, num);
	}

	public static void findIndex(int[] array, int num) {

		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			if (array[i] == num) {
				System.out.println(i);
			} else if (array[j] == num) {
				System.out.println(j);
			}
		}
	}

}
