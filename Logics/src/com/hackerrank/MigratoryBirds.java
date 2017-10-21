package com.hackerrank;

import java.util.Scanner;

public class MigratoryBirds {

	public static void migratoryBirds(int n, int birds[]) {
		int commonFlock[] = new int[6], max = 0, index = 0;
		for (int i = 0; i < n; i++) {
			commonFlock[birds[i]]++;

		}
		for (int j = 1; j < 6; j++) {
			if (max < commonFlock[j]) {
				max = commonFlock[j];
				index = j;
			}
		}
		System.out.println(index);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		in.close();
		migratoryBirds(n, ar);

	}

}
