package com.hackerrank;

import java.util.Scanner;

public class TaumandBday {

	public static void findMinimum(long black, long white, long x, long y, long z) {
		long blackPrice = black * x, whitePrice = white * y;
		if (x == y) {
			System.out.println(blackPrice + whitePrice);
		} else {

			long max = x > y ? x : y;
			if (z + y < max && max == x) {
				System.out.println(whitePrice + (black * (y + z)));
			} else if(z +x  < max && max == y){
				System.out.println(blackPrice + (white * (x + z)));
			}
			else{
				System.out.println(blackPrice + whitePrice);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();
			findMinimum(b, w, x, y, z);
		}
		in.close();

	}

}
