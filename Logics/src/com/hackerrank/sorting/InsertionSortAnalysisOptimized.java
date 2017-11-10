package com.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

//http://www.geeksforgeeks.org/counting-inversions/

/*Learnt this solution from geeksforgeeks
Use merge sort. Inversion count is 
if any a[i]>a[j], then mid -i is the # of inversions. i - first half's counter
j - sencond half's counter and mid is the end of first half
*/
public class InsertionSortAnalysisOptimized {

	public static long merge(long array[], int left, int mid, int right) {
		long inversionCount = 0;
		int leftSize = mid - left + 1;
		int rightSize = right - mid;
		long leftArray[] = new long[leftSize];
		long rightArray[] = new long[rightSize];
		for (int i = 0; i < leftSize; i++) {
			leftArray[i] = array[left + i];
		}
		for (int i = 0; i < rightSize; i++) {
			rightArray[i] = array[mid + 1 + i];
		}
		int leftCounter = 0, rightCounter = 0, temp = left;
		while (leftCounter < leftSize && rightCounter < rightSize) {
			if (leftArray[leftCounter] <= rightArray[rightCounter]) {
				array[temp] = leftArray[leftCounter];
				temp++;
				leftCounter++;
			} else {
				array[temp] = rightArray[rightCounter];
				temp++;
				rightCounter++;
				inversionCount += mid + 1 - (left+leftCounter);
			}
		}
		while (leftCounter < leftSize) {
			array[temp] = leftArray[leftCounter];
			temp++;
			leftCounter++;
		}
		while (rightCounter < rightSize) {
			array[temp] = rightArray[rightCounter];
			temp++;
			rightCounter++;
		}
		return inversionCount;

	}

	public static long mergeSort(long array[], int left, int right) {
		long inversionCount = 0;
		if (left < right) {
			int mid = left + (right - left) / 2;
			inversionCount = mergeSort(array, left, mid);
			inversionCount += mergeSort(array, mid + 1, right);
			inversionCount += merge(array, left, mid, right);
		}
		return inversionCount;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for (int testCase = 0; testCase < testCases; testCase++) {
			int arraySize = scanner.nextInt();
			long array[] = new long[arraySize];
			for (int i = 0; i < arraySize; i++) {
				array[i] = scanner.nextLong();

			}
			System.out.println(mergeSort(array, 0, array.length - 1));
			//System.out.println(Arrays.toString(array));

		}
		scanner.close();

	}

}
