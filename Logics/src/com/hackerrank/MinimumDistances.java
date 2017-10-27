package com.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumDistances {

	public static void findMinDistance(int array[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int min = -1;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int diff = Math.abs(map.get(array[i]) - i);
				if (!flag) {
					min = diff;
					flag = true;
				} else {
					min = min > diff ? diff : min;
				}

			}
			map.put(array[i], i);
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}
		in.close();
		findMinDistance(A);
	}

}
