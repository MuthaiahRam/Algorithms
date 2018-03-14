package com.git.logics;

import java.util.HashMap;
import java.util.Map;

public class Vacation {

	private static int solution(int[] array, int n) {
	
		
		Map<Integer, Integer> locationCount = new HashMap<Integer, Integer>();
		for (int location : array) {
			locationCount.put(location, locationCount.getOrDefault(location, 0) + 1);
		}
		
		int distinctLocationCount = locationCount.size(), shortestVacation = n, sliderStart = 0, sliderEnd = 0,
				uniqueFrequency = 0;
		int[] visitedLog = new int[n];
		/* move sliderEnd until all locations are covered */
		while (sliderEnd < n) {
			int currentVisit = array[sliderEnd];
			/*
			 * if currentVisit is new - visiting first time, increment
			 * uniqueFrequency
			 */
			if (visitedLog[currentVisit] == 0) {
				uniqueFrequency++;
			}
			/* Log the frequency of current location in visitedLog */
			visitedLog[currentVisit]++;

			/* if all locations are visited */
			if (uniqueFrequency == distinctLocationCount) {
				/* shrink the slider to minimize duplicate locations */
				int slider = array[sliderStart];
				// log the location frequency during the shrink phase
				while (visitedLog[slider] > 1) {
					visitedLog[slider]--;
					sliderStart++;
					slider = array[sliderStart];

				}
				shortestVacation = Math.min(shortestVacation, sliderEnd - sliderStart + 1);

			}
			sliderEnd++;
		}
		return shortestVacation;
	}
}
