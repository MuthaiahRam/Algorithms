package com.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FraudActivityNotification {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberDays = scanner.nextInt();
		int dLimit = scanner.nextInt();
		int count = 0;
		int array[] = new int[numberDays];
		for (int i = 0; i < numberDays; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		if (dLimit % 2 != 0) {

			for (int i = dLimit; i < numberDays - 1; i++) {
				int temp[] = Arrays.copyOf(array, array.length);
				int median = array[kthSmallest(array, (i + (i - dLimit)) / 2, i - dLimit, i - 1)];
				

				if (array[i] >= 2 * median) {
					count++;

				}
				array = Arrays.copyOf(temp, temp.length);

			}

		} else {

			for (int i = dLimit; i < numberDays - 1; i++) {
				int temp[] = Arrays.copyOf(array, array.length);
				int median = (array[kthSmallest(array, (i + (i - dLimit)) / 2, i - dLimit, i - 1)]
						+ array[kthSmallest(array, ((i + (i - dLimit)) / 2) - 1, i - dLimit, (i + (i - dLimit)) / 2)])
						/ 2;
				if (array[i] >= 2 * median) {
					count++;
				}
				array = Arrays.copyOf(temp, temp.length);
			}

		}
		System.out.println(count);
		// System.out.println(Arrays.toString(array));

	}

	public static int kthSmallest(int array[], int position, int left, int right) {

		int nextSmallest = left - 1;
		for (int i = left; i < right; i++) {
			if (array[i] <= array[right]) {
				nextSmallest++;
				int temp = array[nextSmallest];
				array[nextSmallest] = array[i];
				array[i] = temp;
			}
		}

		nextSmallest++;
		int temp = array[nextSmallest];
		array[nextSmallest] = array[right];
		array[right] = temp;

		if (nextSmallest == position) {
			return nextSmallest;
		} else if (nextSmallest > position) {
			return kthSmallest(array, position, left, nextSmallest - 1);
		} else {
			return kthSmallest(array, position, nextSmallest + 1, right);
		}
	}

}
