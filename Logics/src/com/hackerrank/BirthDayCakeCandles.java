package com.hackerrank;

import java.util.Scanner;

public class BirthDayCakeCandles {

	static int birthdayCakeCandles(int n, int[] ar) {
		int max = ar[0], count = 1;
		while (n > 1) {
			if (ar[--n] > max) {
				max = ar[n];
				count = 1;
			} else if (ar[n] == max) {
				count++;
			}
		}

		return count;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
