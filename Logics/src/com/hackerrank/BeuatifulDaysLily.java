package com.hackerrank;

import java.util.Scanner;

public class BeuatifulDaysLily {

	public static void findBeautifulDays(int i, int j, int k) {
		int lilyBeautyDays = 0;
		for (int counter = i; counter <= j; counter++) {
			if ((counter - Integer.valueOf(new StringBuilder(String.valueOf(counter)).reverse().toString())) % k == 0) {
				lilyBeautyDays++;
			}

		}
		System.out.println(lilyBeautyDays);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		findBeautifulDays(scanner.nextInt(),scanner.nextInt(), scanner.nextInt());
		scanner.close();

	}

}
