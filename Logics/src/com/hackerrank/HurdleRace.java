package com.hackerrank;

import java.util.Scanner;

public class HurdleRace {

	public static void calculate(int array[], int n, int k) {

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = array[i] > max ? array[i] : max;
		}
		if (k >= max)
			System.out.println("0");
		else
			System.out.println(max-k);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		in.close();
		calculate(height, n, k);
	}
}
