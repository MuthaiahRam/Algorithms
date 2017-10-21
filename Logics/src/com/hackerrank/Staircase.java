package com.hackerrank;

public class Staircase {

	static void createStaircase(int n) {

		for (int i = 1; i <= n; i++) {

			for (int count = n - i; count > 0; count--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		createStaircase(4);
	}
}
