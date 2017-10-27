package com.hackerrank.dynamicprogram;

import java.util.Scanner;

public class Candy {

	public static void distributeCandy(int array[],int num) {

		int chocolate[] = new int[num];
		chocolate[0] = 1;
		//move forward. All students get 1 by default. Add with prev if rating is high
		for (int j = 1; j < num; j++) {
			chocolate[j] = 1;
			if (array[j] > array[j - 1]) {
				chocolate[j] = chocolate[j - 1] + 1;
			}

		}
		//move back. Need to add 1 if rating is high. But might be even higher than the prev one during fwd move
		//so use max function.
		long total = chocolate[num - 1];
		for (int k = num - 2; k >= 0; k--) {
			if (array[k] > array[k + 1]) {
				chocolate[k] = Math.max(chocolate[k], chocolate[k + 1] + 1);
			}
			total += (long)chocolate[k];
			// System.out.println("s" + total + "k" + k);
		}
		System.out.println(total);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();

		}
		sc.close();
		distributeCandy(arr, num);

	}

}
