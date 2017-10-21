package com.hackerrank;

import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		int result[]=new int[n+1];
		int result1[]=new int[n+1];
		for(int i=0;i<n;i++){
			array[i]=scanner.nextInt();
		}
		scanner.close();
		for(int j=0;j<n;j++){
			result[array[j]]=j+1;
			
		}
		for(int j=1;j<n+1;j++){
			result1[j]=result[result[j]];
			
		}
		for(int k=1;k<n+1;k++){
			System.out.println(result1[k]);
		}
	}
}
