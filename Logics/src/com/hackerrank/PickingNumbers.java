package com.hackerrank;

import java.util.Scanner;

public class PickingNumbers {

	public static void pick(int a[]) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			int number = a[i], sum = 0;
			int sameCount = 0, minus1Count = 0, plus1Count = 0;
			for (int j = 0; j < a.length; j++) {
				if (number - a[j] == 0) {
					sameCount++;
				} else if (number - a[j] == -1) {
					minus1Count++;
				} else if (number - a[j] == 1) {
					plus1Count++;
				}
			}
			sum += sameCount;
			sum += minus1Count > plus1Count ? minus1Count : plus1Count;
			max=max<sum?sum:max;
		}
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		in.close();
		pick(a);
	}

}
