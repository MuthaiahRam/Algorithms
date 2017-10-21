package com.hackerrank;

import java.util.Scanner;

public class PlusMinus {
	
	static void calculate(int n,int array[]){
		double positive=0,negative=0,zero=0;
		int count=n;
		while(count>0){
			if(array[--count]>0) 
				positive++;
			else if(array[count]<0)
				negative++;
			else 
				zero++;
		}
		System.out.printf("%.6f",positive/n);
		System.out.printf("\n"+"%.6f",negative/n);
		System.out.printf("\n"+"%.6f",zero/n);
		
		
		
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        calculate(n,arr);
    }

}
