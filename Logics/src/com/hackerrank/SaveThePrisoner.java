package com.hackerrank;

import java.util.Scanner;

public class SaveThePrisoner {

	static void saveThePrisoner(int n, int m, int s) {
		m=m+s-1;
		m=m%n;
		if(m ==0){
			System.out.println(n);
		}
		else{
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int s = in.nextInt();
			saveThePrisoner(n, m, s);

		}
		in.close();
	}

}
