package com.hackerrank;

import java.nio.Buffer;
import java.util.Scanner;

public class AppendDelete {

	static String appendDelete(String initial, String expected, int operations) {
		if (initial.length() + expected.length() <= operations)
			return "Yes";

		int n = initial.length() > expected.length() ? expected.length() : initial.length();
		int counter = 0, match = 0;
		while (counter < n) {

			if (initial.charAt(counter) == expected.charAt(counter)) {
				match++;
			} else {
				break;
			}
			counter++;
		}
		operations -= (initial.length() - match);// deletes
		if (operations < 0)
			return "No";
		else {
			operations -= (expected.length() - match);// inserts
			if (operations < 0)
				return "No";
			else if (operations == 0)
				return "Yes";
			else if (operations % 2 == 0)
				return "Yes";
			else
				return "No";
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		in.close();
		System.out.println(appendDelete(s, t, k));
	}

}
