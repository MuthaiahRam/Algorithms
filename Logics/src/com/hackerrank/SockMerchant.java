package com.hackerrank;

import java.util.Scanner;

public class SockMerchant {

	static int sockMerchant(int array[], int number) {
		int count = 0;
		for (int i = 0; i < number ; i++) {
			if(array[i]!=-1){
			int colour = array[i];
			int pairs = 1;
			for (int j = i + 1; j < number  ; j++) {

				if ( array[j] != -1 && colour == array[j]) {
					pairs++;
					array[j] = -1;
				}

			}
			
			count+=pairs/2;
			array[i] = -1;
		}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		in.close();
		int result = sockMerchant(ar, n);
		System.out.println(result);
	}
}
