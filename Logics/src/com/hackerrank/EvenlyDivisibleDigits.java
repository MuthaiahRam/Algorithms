package com.hackerrank;

import java.util.Scanner;

public class EvenlyDivisibleDigits {

	public static void countDigits(int number) {
		String num = String.valueOf(number).trim();
		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			int divisor = Integer.valueOf(String.valueOf(num.charAt(i)));

			if (divisor == 0) {
				continue;
			} else if (number % divisor == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			countDigits(n);
		}
		in.close();

	}

}
