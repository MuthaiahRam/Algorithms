package com.leet.logics;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public List<String> fizzBuzz(int n) {

		List<String> list = new ArrayList<>();
		String test = "";
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				test += "Fizz";

			}
			if (i % 5 == 0) {
				test += "Buzz";
			}
			if (test == "") {
				test = String.valueOf(i);
			}
			list.add(test);
			test = "";

		}
		return list;

	}

	public static void main(String[] args) {
		FizzBuzz buzz = new FizzBuzz();
		System.out.println(buzz.fizzBuzz(15));
	}
}
