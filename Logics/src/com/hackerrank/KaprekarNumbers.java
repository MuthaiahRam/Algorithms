package com.hackerrank;

import java.util.Scanner;

public class KaprekarNumbers {

	public static void findKaprekar(int p, int q) {
		boolean flag = false;
		for (int i = p; i <= q; i++) {
			long sqaure = (long) i * i;
			int d_digits = (int) Math.pow(10, Math.floor(Math.log10(i)) + 1);
			int first_d = (int) (sqaure / d_digits);
			int remaining_digits = (int) (sqaure % d_digits);

			if (first_d + remaining_digits == i) {
				System.out.print(i+" ");
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("INVALID RANGE");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		findKaprekar(scanner.nextInt(), scanner.nextInt());
		scanner.close();

	}

}
