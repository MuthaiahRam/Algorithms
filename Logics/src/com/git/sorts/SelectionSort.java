package com.git.sorts;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(SelectionSort.selectionSort(new int[]{3,1,5,6})));
	}

	public static int[] selectionSort(int[] input){
		int indexOfMinimum;
		for(int i=0;i<input.length;i++){
			indexOfMinimum=i;
			for(int j=i;j<input.length-1;j++){
				if(input[j]<input[indexOfMinimum]){
					indexOfMinimum=j;
				}
				System.out.println("i: "+i+" j: "+j);
			}
			int minimum=input[indexOfMinimum];
			input[indexOfMinimum]=input[i];
			input[i]=minimum;
			
		}
		return input;
	}
}
