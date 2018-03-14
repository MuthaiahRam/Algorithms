package com.leet.logics;

public class ReverseString {

	public String reverseString(String s) {
		char[] string = s.toCharArray();
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			char temp = string[i];
			string[i] = string[j];
			string[j] = temp;
		}

		return String.valueOf(string);

	}

	public static void main(String[] args) {

		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.reverseString("hello"));

	}

}
