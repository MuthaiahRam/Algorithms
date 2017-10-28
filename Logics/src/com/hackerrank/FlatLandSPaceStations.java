package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class FlatLandSPaceStations {

	public static void calculateMinimumDistance(ArrayList<Integer> spaceStations, int number) {

		Collections.sort(spaceStations);
		int firstSpaceStation = spaceStations.get(0);
		int lastSpaceStation = spaceStations.get(spaceStations.size()-1);
		int max = firstSpaceStation > (number-1)-lastSpaceStation ? firstSpaceStation : (number-1)-lastSpaceStation;
		for (int i = firstSpaceStation+1; i < lastSpaceStation-1; i++) {
			if(lastSpaceStation-firstSpaceStation<max)
				break;
			boolean flag = false;
			int j, k;
			System.out.println("sp" + i);
			for (j = i, k = i; k >= 0 && j < number; j++, k--) {
				if (spaceStations.contains(j)) {
					max = max < (j - i) ? (j - i) : max;
					System.out.println("max from right" + max);
					flag = true;
					break;
				} else if (spaceStations.contains(k)) {
					max = max < (i - k) ? (i - k) : max;
					System.out.println("max from left" + max);
					flag = true;
					break;
				}
			}

			if (!flag) {
				while (k >= firstSpaceStation) {
					if (spaceStations.contains(k)) {
						max = max < (i - k) ? (i - k) : max;
						System.out.println("max from left1" + max);
						flag = true;
						break;
					}
					k--;
				}

				while (j < lastSpaceStation && !flag) {
					if (spaceStations.contains(j)) {
						max = max < (j - i) ? (j - i) : max;
						System.out.println("max from right1" + max);
						flag = true;
						break;
					}
					j++;
				}

			}

		}
		System.out.println(max);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList<Integer> spaceStations = new ArrayList<>();
		for (int c_i = 0; c_i < m; c_i++) {
			spaceStations.add(in.nextInt());
		}
		in.close();
		calculateMinimumDistance(spaceStations, n);
	}

}
