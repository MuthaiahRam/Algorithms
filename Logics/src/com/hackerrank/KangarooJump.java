package com.hackerrank;

import java.util.Scanner;

public class KangarooJump {

	static void kangaroo(int x1, int v1, int x2, int v2) {
		if (x2 >= x1 && v2 > v1)
			System.out.println("NO");
		else if (x2 > x1 && v2 >= v1)
			System.out.println("NO");
		else if (x2 == x1 && v1 == v2) {
			System.out.println("YES");
		} else {
			int diffInDistance = x2 - x1;
			int diffInSpeed = Math.abs(v1 - v2);
			if (diffInDistance % diffInSpeed == 0)
				System.out.println("YES");

			else
				System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		in.close();
		kangaroo(x1, v1, x2, v2);

	}

}
