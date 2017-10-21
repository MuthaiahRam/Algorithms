package com.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ClimbLeaderBoard {
	public static void climb(int scores[], int alice[]) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(scores[0]);
		for (int i = 1; i < scores.length; i++) {
			if (!arrayList.contains(scores[i])) {
				arrayList.add(scores[i]);
			}
		}

		for (int j = 0; j < alice.length; j++) {
			if (alice[j] >= arrayList.get(0)) {
				System.out.println("1");
			} else if (alice[j] < arrayList.get(arrayList.size()-1)) {
				System.out.println(arrayList.size()+1);
			}

			else {
				for (int k = arrayList.size() - 1; k >= 0; k--) {
					if (alice[j] >= arrayList.get(k)) {
						continue;
					} else {
						System.out.println(k + 2);
						break;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];
		for (int scores_i = 0; scores_i < n; scores_i++) {
			scores[scores_i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] alice = new int[m];
		for (int alice_i = 0; alice_i < m; alice_i++) {
			alice[alice_i] = in.nextInt();
		}
		in.close();
		climb(scores, alice);
	}

}
