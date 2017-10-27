package com.hackerrank;

import java.util.Scanner;

public class ChocolateFeast {

	public static void countChocolate(int n, int c, int m) {

		int totalChoclatesAte = 0;
		int chococolates = n / c;
		int wrappers = chococolates;
		totalChoclatesAte = chococolates;
		while(wrappers>=m) {

			chococolates = wrappers / m;
			wrappers = chococolates+wrappers%m;
			totalChoclatesAte+=chococolates;

		} 
		System.out.println(totalChoclatesAte);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			countChocolate(n, c, m);
		}
		in.close();

	}
}
