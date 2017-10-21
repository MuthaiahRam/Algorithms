package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	static int getTotalX(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int count = 0;
		int start = a[a.length - 1];
		int end = b[0];

		for (int i = 1; i <= end / start; i++) {

			int number = start * i;
			boolean flag = false;
			for (int j = 0; j < a.length; j++) {
				if (number % a[j] != 0) {
					flag = true;
					break;
				}
			}
			if (flag)
				continue;

			flag = false;
			for (int k = 0; k < b.length; k++) {
				if (b[k] % number != 0) {
					flag = true;
					break;
				}
			}
			if (!flag)
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}
}
