package com.leet.logics;

import java.util.HashMap;
import java.util.Map;

//Longest_substring_without_repeating_characters

public class Longest_substring {

	/*public int find(String string) {
		StringBuffer buffer = new StringBuffer();
		String result = "";

		if (string == null) {
			// return null;
			return 0;
		} else if (string.length() == 0) {
			// return null;
			return 0;
		} else {
			char c =0;
			for (int i = 0; i < string.length(); i++) {
				System.out.println(result + ":::" + buffer.toString());
				 c = string.charAt(i);
				if (!buffer.toString().contains(String.valueOf(c))) {
					System.out.println("no" + c);
					buffer = buffer.append(c);

				} else {
					System.out.println("yes" + c);
					if (buffer.length() > result.length()) {
						result = buffer.substring(0, buffer.toString().indexOf(c)+1);

					}
					buffer = buffer.replace(0, buffer.length(), buffer.substring(buffer.toString().indexOf(c)+1, buffer.length())+String.valueOf(c));
				}
			}
			
			if (buffer.length() > result.length()) {
				result = buffer.substring(0, buffer.toString().indexOf(c)+1);

			}

		}
		// return result;
		return result.length();
	}
*/
	
	 public int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	            	System.out.println(":::::::: "+ i+ "::::::::::: "+map.get(s.charAt(j)));
	                //i = Math.max(map.get(s.charAt(j)), i);
	            	i=map.get(s.charAt(j));
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		System.out.println(new Longest_substring().lengthOfLongestSubstring("abba"));
	}

}
