package com.hackerrank;

import java.util.Scanner;

public class CircularArrayRotation {

	public static int rotate(int n, int k) {

		int result = n - (k % n);
		if (result == n) {
			result = 0;
		}
		return result;
	}

	public static void find(int[] array, int current, int query) {
		System.out.println(array[(current + query) % array.length]);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int current = rotate(n, k);
		for (int a0 = 0; a0 < q; a0++) {
			int m = in.nextInt();
			find(a, current, m);
		}
		in.close();

	}
}
