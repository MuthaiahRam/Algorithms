package com.hackerrank.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
	
	public static void findClosest(int array[]){
		int minAbsolute=Integer.MAX_VALUE;
		Arrays.sort(array);
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int i=0;i<array.length-1;i++){
			int diff=Math.abs(array[i]-array[i+1]);
			if(diff==minAbsolute){
				arrayList.add(array[i]);
				arrayList.add(array[i+1]);
			}
			else if(diff<minAbsolute){
				arrayList.removeAll(arrayList);
				arrayList.add(array[i]);
				arrayList.add(array[i+1]);
				minAbsolute=diff;
			}
		}
		String result = arrayList.toString();
		System.out.println(result.substring(1, result.length() - 1).replace(",", ""));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int array[] = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		findClosest(array);
		
	}

}
