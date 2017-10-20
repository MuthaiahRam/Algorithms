package com.leet.logics;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {

		TwoSum sum = new TwoSum();
		int nums[] = { -3, 4, 3, 90 };
		System.out.println(Arrays.toString(sum.twoSum(nums, 0)));
	}

	public int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int number1 = nums[i];

			for (int j = i + 1; j < nums.length; j++) {
				int number2 = nums[j];

				if (number1 + number2 == target) {
					result[0] = i;
					result[1] = j;
return result;
				}

			}
		}
		return result;
	}
}
