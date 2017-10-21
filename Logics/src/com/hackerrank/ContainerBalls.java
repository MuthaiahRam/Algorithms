package com.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ContainerBalls {

	public static boolean isOrganized(int m[][], int n) {
		BigInteger balls[] = new BigInteger[n];
		BigInteger containers[] = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
					if (containers[i] == null && balls[i] == null) {
						//System.out.println("i" + i + "j" + j + "here");
						containers[i] = new BigInteger(String.valueOf(m[i][j]));
						//System.out.println(containers[i]);
						balls[i] = new BigInteger(String.valueOf(m[j][i]));
					} else {
						//System.out.println("i" + i + "j" + j + "there");
						containers[i] = containers[i].add(BigInteger.valueOf(m[i][j]));
						//System.out.println(containers[i]);
						balls[i] = balls[i].add(BigInteger.valueOf(m[j][i]));
					}
				

			}

		}
		for(int i=0;i<n;i++){
			Arrays.sort(containers);
			Arrays.sort(balls);
			//System.out.println(Arrays.toString(containers));
			//System.out.println(Arrays.toString(balls));
			if (containers[i].compareTo(balls[i]) != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int[][] M = new int[n][n];
			for (int M_i = 0; M_i < n; M_i++) {
				for (int M_j = 0; M_j < n; M_j++) {
					M[M_i][M_j] = in.nextInt();
				}
			}

			if (isOrganized(M, n)) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}

		}
		in.close();

	}

}
