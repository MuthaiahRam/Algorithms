package com.hackerrank;

import java.util.Scanner;

public class NonDivisibleSubset {

	static void findSubset(int[] array, int n, int k) {
		
		int count=0;
		int mod[]=new int[k];
		for(int i=0;i<n;i++){
			mod[array[i]%k]++;
		}
		if(mod[0]>0)
			count++;
		if(k%2==0 && mod[k/2]>0)
			count++;
		//There is a difference between 2*j<k and j<k/2 wrt to k being odd or even
		for(int j=1;j<Math.ceil((double)k/2);j++){
			count+=Math.max(mod[j], mod[k-j]);
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = in.nextInt();
		in.close();
		findSubset(array, n, k);
	}
}
