package com.leet.logics;

import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unused")
public class SingleNumber {
	/*
	 * public static int singleNumber(int[] nums) { HashSet<Integer> set=new
	 * HashSet<Integer>(); HashSet<Integer> unique=new HashSet<Integer>();
	 * 
	 * for(int i=0;i<nums.length;i++){ if(set.add(nums[i])) unique.add(nums[i]);
	 * else unique.remove(nums[i]); } return (int)unique.toArray()[0]; }
	 */

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Integer integer = null;
		for (int i = 0; i < nums.length; i++) {
			integer = map.get(nums[i]);
			map.put(nums[i], integer == null ? 1 : integer + 1);
		}
		int i = 0;
		for (; i < nums.length; i++) {

			if (map.get(nums[i]) == 1) {
				break;
			}
		}
		return nums[i];

	}

	public static void main(String[] args) {
		System.out.println(SingleNumber.singleNumber(
				new int[] { 17, 12, 5, -6, 12, 4, 17, -5, 2, -3, 2, 4, 5, 16, -3, -4, 15, 15, -4, -5, -6 }));
	}
}
