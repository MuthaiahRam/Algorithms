package com.hackerrank;

import java.util.Scanner;

public class LibraryFine {

	public static void calculateFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		if (y1 - y2 == 0) {
			int months = m1 - m2;
			if ((months == 0)) {
				int dates = d1 - d2;
				if ((dates <= 0)) {
					System.out.println("0");
				} else {
					System.out.println(dates * 15);
				}
			}
			else if(months<0){
				System.out.println("0");
			}
			else {
				System.out.println(500 * months);
			}
		} else if (y1 - y2 < 0) {
			System.out.println("0");
		} else {
			System.out.println("10000");
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		in.close();
		calculateFine(d1, m1, y1, d2, m2, y2);
	}

}
