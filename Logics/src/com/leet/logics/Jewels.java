package com.leet.logics;

public class Jewels {

	public static void main(String[] args) {
		String J = "z", S = "ZZ";
		int output = 0;
		int lowerCase[] = new int[26];
		int upperCase[] = new int[26];
		for (int c : S.toCharArray()) {
			if (c >= 97) {
				lowerCase[c - 97] += 1;
			} else {
				upperCase[c - 65] += 1;
			}
		}
		for (int c : J.toCharArray()) {
			if (c >= 97) {
				output += lowerCase[c - 97];
			} else {
				output += upperCase[c - 65];
			}
		}
		System.out.println(output);
	}
}
