package com.leet.logics;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSums1 {

	public int[] twoSums(int nums[], int target) {
		// Arrays.sort(nums);
		/*int start = 0, end = nums.length - 1;
		while (start <= nums.length - 1 && end >= 0) {
			int sum = nums[start] + nums[end];
			if (sum == target) {
				int result[] = new int[] { start, end };
				Arrays.sort(result);
				return result;
			}

			end--;
			start++;

		}
		return null;*/
		
		 Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement) && map.get(complement) != i) {
		            return new int[] { i, map.get(complement) };
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		TwoSums1 sum = new TwoSums1();
		int nums[] = { 3,2,3};
		System.out.println(Arrays.toString(sum.twoSums(nums, 6)));
	}

}
