package com.leet.logics;

public class JudgeRouteCircle {
	public static boolean judgeCircle(String moves) {
		int u = 0, d = 0, r = 0, l = 0;
		for (char c : moves.toCharArray()) {
			if (c == 'U') {
				u++;
			} else if (c == 'D') {
				d++;
			} else if (c == 'R') {
				r++;
			} else {
				l++;
			}
		}
		if (u == d && r == l)
			return true;

		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(judgeCircle("LL"));
	}

}
