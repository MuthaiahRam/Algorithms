package com.hackerrank;

import java.util.Scanner;

public class DrawingBook {

	static int solve(int totalPages, int page) {

		boolean start = page <= totalPages / 2;
		if (start)
			return page / 2;
		else {
			if (totalPages % 2 == 0)
				return (int) Math.ceil(((double) totalPages - page) / 2);
			else
				return (int) Math.floor(((double) totalPages - page) / 2);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		in.close();
		int result = solve(n, p);
		System.out.println(result);
	}

}
