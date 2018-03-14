package com.hackerrank;

public class Test {

	static boolean alert(int[] inputs, int windowSize, float allowedIncrease) {

		double minAverage = Double.MIN_VALUE;

		for (int i = 0; i <= inputs.length - windowSize; i++) {
			int size = windowSize, max = 0, windowSum = 0, j = i;
			double windowAverage = 0;
			while (size > 0) {
				windowSum += inputs[j];
				if (inputs[j] > max) {
					max = inputs[j];

				}
				j++;
				size--;

			}
			windowAverage = (double) windowSum / windowSize;

			if (windowAverage > (minAverage * allowedIncrease)) {

				return true;
			}
			if (windowAverage < minAverage) {
				minAverage = windowAverage;
			}
			if (max > (allowedIncrease * windowAverage)) {

				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(alert(new int[] { 8,100,100,100,100,100,100,100,100 }, 2, 1.5f));
	}

}
