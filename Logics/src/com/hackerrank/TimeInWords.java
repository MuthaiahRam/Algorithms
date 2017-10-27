package com.hackerrank;

import java.util.Scanner;

public class TimeInWords {

	public static void printTimeinWords(int hour, int minutes) {

		String timeinword[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
				"twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
				"twenty eight", "twenty nine" };
		String words = "";
		if (minutes == 0) {
			words = timeinword[hour] + " o' clock";
		} else if (minutes == 15) {
			words = "quarter past " + timeinword[hour];
		} else if (minutes == 30) {
			words = "half past " + timeinword[hour];
		} else if (minutes == 45) {
			words = "quarter to " + timeinword[hour + 1];
		} else if (minutes < 30) {
			words = timeinword[minutes] + " minutes past " + timeinword[hour];
		} else {
			words = timeinword[60 - minutes] + " minutes to " + timeinword[hour + 1];
		}
		System.out.println(words);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minutes = scanner.nextInt();
		scanner.close();
		printTimeinWords(hour, minutes);

	}

}
