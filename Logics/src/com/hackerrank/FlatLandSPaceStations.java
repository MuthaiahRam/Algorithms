package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FlatLandSPaceStations {

	public static void calculateMinimumDistance(ArrayList<Integer> spaceStations, int number) {

		Collections.sort(spaceStations);
		System.out.println(spaceStations);
		int firstStation = spaceStations.get(0), lastStation = spaceStations.get(spaceStations.size() - 1);
		int leftStation = 0, rightStation = 0;
		int max = firstStation > number - 1 - lastStation ? firstStation : number - 1 - lastStation;
		//if first and last are close to each other, one of those is max
		if (lastStation - firstStation < max) {
			System.out.println(max);
			return;
		}
		// iterate through space stations and find max by calculating min distance for each station
		for (int i = 1; i < spaceStations.size(); i++) {

			leftStation = spaceStations.get(i - 1);
			rightStation = spaceStations.get(i);
			//to find min for each stattion between left and right

			/*for (int k = leftStation + 1; k < rightStation; k++) {

				max = Math.max(max, Math.min(k - leftStation, rightStation - k));

			}*/
			
			//It is OK if calculated for the middle one alone.
			max=(int)Math.max(max, Math.floor(rightStation-leftStation)/2);

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
