package com.leet.logics;

import java.util.Arrays;

public class MoveZeros {

	public static void moveZeroes(int[] nums) {
		int nextIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!(nums[i] == 0)) {

				nums[nextIndex] = nums[i];
				nextIndex++;

			}
		}
		for (int i = nums.length - 1; i >= nextIndex; i--) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		MoveZeros.moveZeroes(new int[] { 0, 1, 0, 3, 12 });
	}
}
