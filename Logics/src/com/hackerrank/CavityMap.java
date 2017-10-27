package com.hackerrank;

import java.util.Scanner;

public class CavityMap {

	public static void printCavity(int map[][]) {
		int length = map.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i == 0 || j == 0 || i == length - 1 || j == length - 1) {
					System.out.print(map[i][j]);
				} else if (map[i][j] > map[i - 1][j] && map[i][j] > map[i + 1][j] && map[i][j] > map[i][j + 1]
						&& map[i][j] > map[i][j - 1]) {
					System.out.print("X");

				}
				else{
					System.out.print(map[i][j]);
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] grid = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
		}
		in.close();
		int map[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			String string = grid[i];
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.valueOf(String.valueOf((string.charAt(j))));
			}
		}
		printCavity(map);

	}

}
