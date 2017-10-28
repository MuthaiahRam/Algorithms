package com.hackerrank;

import java.util.Scanner;

public class ServiceLane {

	public static void findLargest(int[] array,int i,int j){
		int min=Integer.MAX_VALUE;
		for(int k=i;k<=j;k++){
			min=min>array[k]?array[k]:min;
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            findLargest(width, i, j);
        }
        in.close();
    }
}
