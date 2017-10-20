package com.git.logics;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {

		System.out.println(MajorityElement.findMajorityElement(new int[] { 1, 2, 2,2,2,2,3,3}));

	}

	/* Majority element is one that occurs n/2 times. */

	public static int findMajorityElement(int[] input) {
		Arrays.sort(input); //nlogn
		System.out.println(Arrays.toString(input));
		for (int i = 0; i <input.length / 2; i++) {
			int length = i + ((input.length) / 2);
			if (input[i] == input[length] && i != length) {
				return input[i];
			}
		}
		return -1;
	}

	/* OTHER SOLUTIONS */

	/*
	 * 1.Create a HashMap<Integer, Integer> 2.For every element in the array,
	 * check if the element exists in the Map 3.if exits, increase its value by
	 * 1 4.if not exists, add the element as key and 0 as value 5.As loop exits,
	 * find the key in the map with the maximum value Complexity: Loop through
	 * the whole array + loop through the HashMap
	 */

	/*
	 * Use nested loops for this. Increase the counter. Anytime, counter= n/2
	 * return the element candidate in that iteration
	 */
	
	

}
