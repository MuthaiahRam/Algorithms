package com.leet.logics;

import java.util.HashSet;

public class DistributeCandies {

	public static int distributeCandies(int[] candies) {
		HashSet<Integer> hashSet = new HashSet<>();
		int share = candies.length / 2;
		for (int candy : candies) {
			hashSet.add(candy);
			if (hashSet.size() >= share) {
				return share;
			}
		}
		return hashSet.size();
	}
	
	public static void main(String[] args) {
		System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
	}

}
