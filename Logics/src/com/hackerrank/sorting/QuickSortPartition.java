package com.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortPartition {
	
	public static void partition(int array[]){
		int pivot=array[0];
		int nextSmall=0;
		for(int i=1;i<array.length;i++){
			if(array[i]<pivot){
				nextSmall++;
				int temp=array[nextSmall];
				array[nextSmall]=array[i];
				array[i]=temp;
			}
		}
		array[0]=array[nextSmall];
		array[nextSmall]=pivot;
		String string = Arrays.toString(array);
		System.out.println(string.substring(1, string.length() - 1).replace(",", ""));
	}
	
	
	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
          System.out.println("");
     }
      
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int[] ar = new int[n];
          for(int i=0;i<n;i++){
             ar[i]=in.nextInt(); 
          }
          in.close();
          partition(ar);
          
      }  

}
