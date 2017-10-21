package com.hackerrank.sorting;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSorting {

	public static void sort(int low, int high, String[] array) {
		if (low < high) {
			int m = (low + high) / 2;
			sort(low, m, array);
			sort(m + 1, high, array);
			merge(array, low, high, m);
		}

	}

	public static void merge(String array[], int low, int high, int m) {

		int tempSize1 = m - low + 1;
		int tempSize2 = high - m;
		String temp1[] = new String[tempSize1];
		String temp2[] = new String[tempSize2];
		int temp1Count = 0, temp2Count = 0, original = low;
		for (int i = 0; i < tempSize1; i++) {
			temp1[i] = array[low + i];
		}
		for (int j = 0; j < tempSize2; j++) {
			temp2[j] = array[m + 1 + j];
		}

		while (temp1Count < tempSize1 && temp2Count < tempSize2) {
			String s1 = temp1[temp1Count], s2 = temp2[temp2Count];
			if (s1.equals(s2)) {
				array[original++] = s1;
				array[original++] = s2;
				temp1Count++;
				temp2Count++;
			} else {
				BigInteger bigInteger1 = new BigInteger(temp1[temp1Count]);
				BigInteger bigInteger2 = new BigInteger(temp2[temp2Count]);

				if (bigInteger1.compareTo(bigInteger2) < 0) {

					array[original] = temp1[temp1Count];
					temp1Count++;
					original++;

				} else {
					array[original] = temp2[temp2Count];
					temp2Count++;
					original++;
				}
			}
		}
		while (temp1Count < tempSize1) {
			array[original] = temp1[temp1Count];
			temp1Count++;
			original++;
		}
		while (temp2Count < tempSize2) {
			array[original] = temp2[temp2Count];
			temp2Count++;
			original++;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] unsorted = new String[n];
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			unsorted[unsorted_i] = in.next();
		}
		in.close();
		sort(0, n - 1, unsorted);
		for (int i = 0; i < n; i++)
			System.out.println(unsorted[i]);

	}

}
