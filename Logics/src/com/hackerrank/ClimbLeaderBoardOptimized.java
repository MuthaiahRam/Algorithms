package com.hackerrank;

import java.util.Scanner;

public class ClimbLeaderBoardOptimized {

	static int[] makeRank(int[] scores) {
		int[] ranks = new int[scores.length];
		int rank = 1;
		for (int i = 0; i < ranks.length; i++) {
			if (i > 0 && scores[i] != scores[i - 1]) {
				rank++;
			}
			ranks[i] = rank;
		}
		return ranks;
	}

	static int climb(int[] scores, int[] ranks, int alice) {
		int low = 0;
		int high = scores.length - 1;
		int aliceRank = 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (alice == scores[mid]) {
				aliceRank = ranks[mid];
				break;
			} else if (alice < scores[mid]) {
				aliceRank = ranks[mid] + 1;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return aliceRank;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		int[] ranks = makeRank(scores);

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int alice = sc.nextInt();
			System.out.println(climb(scores, ranks, alice));
		}

		sc.close();
	}

}
