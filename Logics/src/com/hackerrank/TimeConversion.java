package com.hackerrank;

import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) {

		boolean flag = s.contains("PM");
		StringBuffer buffer = new StringBuffer(s).delete(s.length() - 2, s.length());
		if (!flag) {

			if (buffer.toString().startsWith("12")) {
				buffer.delete(0, 2);
				s = "00" + buffer.toString();
			} else {
				s = buffer.toString();
			}
			return s;

		} else {
			if (buffer.toString().startsWith("12")) {
				buffer.delete(0, 2);
				s = "12" + buffer.toString();
			} else {
				buffer.delete(0, 2);
				String array[] = s.split(":");
				int hour = Integer.valueOf(array[0]) + 12;
				s = String.valueOf(hour) + buffer;
			}
			
		}
		return s;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
		in.close();
	}

}
