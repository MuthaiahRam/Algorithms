package com.hackerrank;

import java.util.Scanner;

public class JumpClouds {

	public static void calculateEnergy(int c[], int k, int n) {
		
		int thunderCount = 0, normalCount = 0;
		int i=0;
		do {
			
			i = (i + k) % n;
			if (c[i] == 1) {
				thunderCount++;
			} else {
				normalCount++;
			}

		}while(i>0);
		System.out.println (100-((3*thunderCount) + normalCount));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		in.close();
		calculateEnergy(c, k, n);
	}

}
