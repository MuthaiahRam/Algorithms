package com.leet.logics;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
		if (s == t)
			return true;
		if (s.length() != t.length())
			return false;
		String[] array = t.split("");
		ArrayList<String> set = new ArrayList<String>();
		set.addAll(Arrays.asList(array));

		for (int i = 0; i < s.length(); i++) {

			if (!set.remove((String.valueOf(s.charAt(i))))) {
				return false;
			}
		}
		if (set.isEmpty())
			return true;
		return false;

	}

	public static void main(String[] args) {
		System.out.println(ValidAnagram.isAnagram("hqbqo", "lsmna"));
	}

}
