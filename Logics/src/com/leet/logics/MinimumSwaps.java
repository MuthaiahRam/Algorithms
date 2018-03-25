package com.leet.logics;

public class MinimumSwaps {

	public static int minSwap(int[] A, int[] B) {
		int count1 = 0, count2 = 0;
		int C[] = A, D[] = B;
		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] >= A[i + 1]) {
				count1++;
				int temp=A[i+1];
				A[i + 1] = B[i + 1];
				B[i+1]=temp;
			}

		}
		for (int i = 0; i < B.length - 1; i++) {

			if (B[i] >= B[i + 1]) {
				count2++;
				
			}

		}
		System.out.println(count1 + "::" + count2);
		return Math.min(count1, count2);
	}

	public static void main(String[] args) {
		System.out.println(minSwap(new int[] { 0, 7, 8, 10, 10, 11, 12, 13, 19, 18 },
				new int[] { 4, 4, 5, 7, 11, 14, 15, 16, 17, 20 }));
	}

}
