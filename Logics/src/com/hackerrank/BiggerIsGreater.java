package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsGreater {

	public static void findString(String string) {
		boolean flag = false;
		char[] array = string.toCharArray();
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] > array[i - 1]) {
				flag = true;
				int firstSmall = i - 1;
				int immediateLarge = array.length - 1;
				for (int l = array.length - 1; l > i; l--) {
					if (array[l] > array[i - 1]) {
						immediateLarge = l;
					}
				}

				char temp = string.charAt(firstSmall);

				array[firstSmall] = array[immediateLarge];
				array[immediateLarge] = temp;
				for (int k = 0; k < i; k++) {
					System.out.print(array[k]);
				}

				array = Arrays.copyOfRange(array, i, array.length);
				Arrays.sort(array);

				for (int k = 0; k < array.length; k++) {
					System.out.print(array[k]);
				}
				break;
			}
		}
		if (!flag)
			System.out.print("no answer");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			findString(scanner.next());
			System.out.println();
		}
		scanner.close();
	}

}
