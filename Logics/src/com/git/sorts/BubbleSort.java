package com.git.sorts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(BubbleSort.bubbleSort(new int[]{1,2,5,6})));
	}

	public static int[] bubbleSort(int[] input)
	{int temp;boolean flag;
		for(int i=0;i<=input.length-1;i++){
			flag=false;
			for(int j=0;j<input.length-i-1;j++){
				System.out.println("run"+"i: "+i+"j:"+j);
				if(input[j]>input[j+1]){
					temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
					flag=true;
				}
				
			}
			if(!flag){
				return input;
			}
		}
		
		
		
		return input;
	}
}
