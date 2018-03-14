package com.git.logics;

import java.util.HashMap;

public class AlecBob {

	public static int solution(String A, String B) {
		int alecWins = 0;
		char[] alecCards = A.toCharArray();
		char[] bobCards = B.toCharArray();
		HashMap<Character, Integer> deck = new HashMap<Character, Integer>();
		deck.put('A', 13);
		deck.put('K', 12);
		deck.put('Q', 11);
		deck.put('J', 10);
		deck.put('T', 9);

		for (int i = 0; i < alecCards.length; i++) {
			int alecCard = 0;
			int bobCard = 0;

			alecCard = Character.isDigit(alecCards[i]) ? Integer.parseInt(String.valueOf(alecCards[i]))
					: deck.get(alecCards[i]);
			bobCard = Character.isDigit(bobCards[i]) ? Integer.parseInt(String.valueOf(bobCards[i]))
					: deck.get(bobCards[i]);
			alecWins = alecCard > bobCard ? ++alecWins : alecWins;

		}

		return alecWins;
	}
	public static void main(String[] args) {
		System.out.println(AlecBob.solution("A586QK", "JJ653K"));
	}

}
