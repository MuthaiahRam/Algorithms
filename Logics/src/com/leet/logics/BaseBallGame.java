package com.leet.logics;

import java.util.Stack;

public class BaseBallGame {

	public int calPoints(String[] ops) {
		Stack<Integer> stack=new Stack<Integer>(); 
		int output = 0;
		for (String op : ops) {
			if (op.equals("C")) {
				output-=stack.pop();
				
				
			} else if (op.equals("D")) {
				int current=2*stack.peek();
				stack.push(current);
				output+=current;
				
			} else if (op.equals("+")) {
				int temp=stack.pop();
				int current=stack.peek()+temp;
				stack.push(temp);
				stack.push(current);
				output+=current;
				
			} else {
				stack.push(Integer.valueOf(op));
				output+=stack.peek();
				
			}
		}
		return output;
	}

	public static void main(String[] args) {
		BaseBallGame ballGame = new BaseBallGame();
		System.out.println(ballGame.calPoints(new String[] { "5","-2","4","C","D","9","+","+" }));
	}

}
