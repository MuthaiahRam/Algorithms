package com.leet.logics;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		int vote = 0, lastSeen = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (lastSeen == nums[i]) {
				vote++;
			} else {
				vote--;
				if (!(vote > 0)) {
					lastSeen = nums[i];
					vote = 1;
				}

			}
		}
		if (vote > 0) {
			vote = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == lastSeen) {
					vote++;
				}
			}

		}
		if (vote > nums.length / 2) {
			return lastSeen;
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		System.out.println(MajorityElement.majorityElement(new int[] { 6, 6, 6, 7, 7 }));
	}
}
