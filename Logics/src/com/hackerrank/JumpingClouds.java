package com.hackerrank;

import java.util.Scanner;

public class JumpingClouds {

	public static void play(int n, int clouds[]) {
		int countOfSteps = 1;
		//n-3 - Magic Number - last will always be 0. Sure win. So n-2. size -1. Total n-3.
		for (int i = 0; i < n-3; i++) {
			if (clouds[i + 2] != 1) {
				i = i + 1;
				}
			
			countOfSteps++;
		}
		System.out.println(countOfSteps);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		in.close();
		play(n, c);
	}

}
