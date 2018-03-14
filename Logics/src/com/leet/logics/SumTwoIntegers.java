package com.leet.logics;

public class SumTwoIntegers {
	static int carry = 0;

	public static int getSum(int a, int b) {
		do {
			carry = a & b;
			a = a ^ b;
			b = carry << 1;
		} while (carry != 0);

		return a;
	}

	public static void main(String[] args) {
		System.out.println(SumTwoIntegers.getSum(1, 2));
	}
}
