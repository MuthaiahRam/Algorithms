package com.leet.logics;

public class HammingDistance {

	public static int hammingDistance(int x, int y) {
		int xor=x^y;
		int outputCount=0;
		while(xor!=0){
			xor=xor & (xor-1);
			outputCount++;
		}
		return outputCount;
	}
	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}

}
