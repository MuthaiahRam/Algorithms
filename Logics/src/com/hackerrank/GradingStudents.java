package com.hackerrank;

import java.util.Scanner;

public class GradingStudents {

	static int[] solve(int[] grades) {
		int length = grades.length;
		int result[] = new int[length];
		for (int i = 0; i < length; i++) {
			int grade = grades[i];
			if (grade >= 38) {
				int diff = (5 - (grade % 5));
				result[i] = diff < 3 ? diff + grade : grade;
			} else {
				result[i] = grade;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		in.close();
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

	}
}
