package com.hackerrank;

public class DiagonalDifference {

	static void calculate(int n,int[][] matrix){
		int count=0,diagonal1=0,diagonal2=0;
		while(n>0){
			diagonal1+=matrix[--n][n];
			diagonal2+=matrix[n][count++];
		}
		
		System.out.println(Math.abs(diagonal2-diagonal1));
	}
}
