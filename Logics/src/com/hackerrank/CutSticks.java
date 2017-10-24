package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CutSticks {
	
	public static void findLast(int sticks[]){
		Arrays.sort(sticks);
		int length=sticks.length;
		System.out.println(length);
		int num=sticks[0],count=1;
		for(int i=1;i<sticks.length;i++){
			if(num==sticks[i]){
				count++;
			}
			else{
				length-=count;
				System.out.println(length);
				count=1;
				num=sticks[i];
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		in.close();
		findLast(arr);
	}

}
