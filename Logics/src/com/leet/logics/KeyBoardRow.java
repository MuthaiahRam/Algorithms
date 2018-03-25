package com.leet.logics;

import java.util.ArrayList;
import java.util.Arrays;

public class KeyBoardRow {
	int arrayRow1[] = new int[26];
	int arrayRow2[] = new int[26];
	int arrayRow3[] = new int[26];

	public String[] findWords(String[] words) {
		String row1 = "QWERTYUIOP", row2 = "ASDFGHJKL", row3 = "ZXCVBNM";
		ArrayList<String> list = new ArrayList<>();
		arrayFill(row1, arrayRow1);
		arrayFill(row2, arrayRow2);
		arrayFill(row3, arrayRow3);
		for (String string : words) {
			if (checkWords(string)) {
				list.add(string);
			}
		}
		return list.toArray(new String[0]);

	}

	public void arrayFill(String string, int[] array) {
		for (char alphabet : string.toLowerCase().toCharArray()) {
			array[alphabet - 97] = 1;
		}
	}

	public boolean checkWords(String string) {
		int row1 = 0, row2 = 0, row3 = 0;
		for (char c : string.toLowerCase().toCharArray()) {
			if (arrayRow1[c - 97] == 1) {
				row1++;
			} else if (arrayRow2[c - 97] == 1) {
				row2++;
			} else {
				row3++;// assume only alphabets
			}
			if (row2 > 0 && row1 > 0 || row1 > 0 && row3 > 0 || row2 > 0 && row3 > 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		KeyBoardRow boardRow = new KeyBoardRow();
		System.out.println(Arrays.toString(boardRow.findWords(new String[] { "Hello", "Alaska", "Dad", "Peace" })));
	}

}
