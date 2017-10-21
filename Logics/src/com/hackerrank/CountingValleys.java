package com.hackerrank;

import java.util.Scanner;

public class CountingValleys {

	public static void countValley(int n, String sequence) {

		int stepCount = 0, valley = 0;
		for (int i = 0; i < n; i++) {
			if (sequence.charAt(i) == 'U') {
				if (stepCount == -1) {
					valley++;
				}
				stepCount++;
			} else
				stepCount--;

		}

		System.out.println(valley);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		countValley(scanner.nextInt(), scanner.next());
		scanner.close();
	}

}
