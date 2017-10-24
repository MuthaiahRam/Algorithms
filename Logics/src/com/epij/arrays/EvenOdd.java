package com.epij.arrays;

import java.util.Arrays;

public class EvenOdd {

	public static int[] evenFirst(int array[]) {
		int evenPointer = 0, oddPointer = array.length - 1;
		while (oddPointer > evenPointer) {
			if (array[evenPointer] % 2 == 0) {
				evenPointer++;
			} else {
				while (array[oddPointer] % 2 != 0) {
					oddPointer--;
				}
				int temp = array[evenPointer];
				array[evenPointer++] = array[oddPointer];
				array[oddPointer--] = temp;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(evenFirst(new int[]{1,3,5,7,9,8,10,11,1,2,1,5,14,1,7,1,7})));
	}

}
