package com.epij.arrays;

import java.util.Arrays;

public class DutchNationalFlag3 {
	
	public static int[] DNF(int[] array,int pivot){
		int smallest=0,largest=array.length-1,equal=0,pivotElement=array[pivot];
		while(largest>equal){
			if(array[equal]<pivotElement){
				
			}
			
			else{
				while(array[largest]>pivot){
					largest--;
				}
				int temp=array[largest];
				array[largest]=array[smallest];
				array[smallest]=temp;
				largest=temp==pivotElement?largest:largest--;
				smallest=temp==pivotElement?smallest:smallest++;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(DNF(new int[]{0,0,1,2,3,0,4,2,5}, 3)));
	}
}
