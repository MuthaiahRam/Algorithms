package com.git.logics;

public class Test {

	public int solution(int[] A) {

		int length = A.length;
		int Bin = 0;

		for (int i = 0; i < length; i++) {

			Bin = Bin + powr(A[i]);
		}

		return (find(Bin));
	}

	public int powr(int num) {
		return (int) Math.pow(2, num);
	}

	public int find(int Bin) {
		int count = 0, power = 0;

		while (Bin > 0) {

			power = findPower(Bin);

			if (power >= 0) {
				count++;
			}
			Bin = Bin - (int) Math.pow(2, power);

		}
		System.out.println(count);
		return count;

	}

	public int findPower(int n) {
		int p = (int) (Math.log(n) / Math.log(2));
		return p;

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.solution(new int[] { 0, 0 });
	}

}
