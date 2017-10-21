package com.hackerrank;

import java.util.Scanner;

public class DesignerPdfViewer {

	public static void findArea(String word, int[] heights) {
		int stringLength = word.length(), max = 0;
		for (int i = 0; i < stringLength; i++) {
			int value = heights[word.charAt(i) - 97];
			max = value > max ? value : max;
		}
		System.out.println(max * stringLength);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		in.close();
		findArea(word, h);
	}

}
