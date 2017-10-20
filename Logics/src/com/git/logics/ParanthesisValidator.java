package com.git.logics;

import java.util.Stack;

public class ParanthesisValidator {

	public static void main(String[] args) {
System.out.println(ParanthesisValidator.validate("{{}}{}{{{}{}{}}}"));
	}

	public static boolean validate(String sequence) {
		Stack<Character> paranthesis = new Stack<>();
		paranthesis.add(sequence.charAt(0));
		for (int i = 1; i < sequence.length(); i++) {
			//check this condition before peek(): may result in Exception
			if(paranthesis.isEmpty()){
				paranthesis.push(sequence.charAt(i));
			}
			else if (!paranthesis.peek().equals(sequence.charAt(i))) {
				paranthesis.pop();
			} else {
				paranthesis.push(sequence.charAt(i));
			}

		}
		if (paranthesis.isEmpty())
			return true;
		else
			return false;
	}
}
