package com.hackerrank;

import java.util.Scanner;

public class ACMICPCTeam {

	public static void calculate(String[] topics) {
		int max = 0, maxCount = 0;
		for (int i = 0; i < topics.length - 1; i++) {
			for (int j = i + 1; j < topics.length; j++) {
				String string = topics[i];
				String string2 = topics[j];
				int count = 0;
				for (int k = 0; k < string.length(); k++) {

					if (string.charAt(k) == '1' || string2.charAt(k) == '1') {

						count++;
					}
				}

				if (max < count) {
					maxCount = 1;
					max = count;
				} else if (max == count) {
					maxCount++;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxCount);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String topic[] = new String[n];
		for (int topic_i = 0; topic_i < n; topic_i++) {
			topic[topic_i] = in.next();
		}
		in.close();
		calculate(topic);
	}

}
