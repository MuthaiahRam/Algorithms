package com.leet.logics;

public class ReverseWords {

	public String reverseWords(String s) {
		String array[] = s.split(" ");
		String output = "";
		for (String word : array) {

			StringBuffer buffer = new StringBuffer(word);
			buffer = buffer.reverse();

			output = output.concat(buffer.toString().concat(" "));
		}
		return output.trim();

	}

	public static void main(String[] args) {
		ReverseWords reverseString = new ReverseWords();
		System.out.println(reverseString.reverseWords("Let's take LeetCode contest")+":");
	}
}
