package com.hackerrank;

import java.util.Scanner;

public class LisaWorkbook {

	public static void countSpecial(int[] t, int k) {
		int specialCount = 0;
		int currentPageNumber = 1;
		int index = 0;
		for (int problemNum : t) {
			for (int i = 1; i <= problemNum; i++) {
				if (i == currentPageNumber) {
					specialCount++;
				}

				index++;
				if (index == k) {
					currentPageNumber++;
					index = 0;
				}
			}

			if (index != 0) {
				currentPageNumber++;
				index = 0;
			}
		}
		System.out.println(specialCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numberOfChapters = sc.nextInt();
		int problemPerChapter = sc.nextInt();
		int[] pagesPerChapter = new int[numberOfChapters];
		for (int i = 0; i < pagesPerChapter.length; i++) {
			pagesPerChapter[i] = sc.nextInt();
		}
		sc.close();
		countSpecial(pagesPerChapter, problemPerChapter);

	}

}
