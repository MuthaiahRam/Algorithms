package com.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FullCountingSort {
	
	public static void fullCountingSort(int[] number,String[] string){
		int count[]=new int[100];
		Arrays.fill(count, 0);
		String output[]=new String[number.length];
		Arrays.fill(output,"-");
		for(int i=0;i<number.length;i++){
			count[number[i]]+=1;
		}
		for(int i=1;i<count.length;i++){
			count[i]+=count[i-1];
		}
		for(int i=string.length-1;i>=string.length/2;i--){
			
			output[count[number[i]]-1]=string[i];
			count[number[i]]--;
		}
		String result = Arrays.toString(output);
		System.out.println(result.substring(1, result.length() - 1).replace(",", ""));
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int number[]=new int[num];
		String string[]=new String[num];
		for(int i=0;i<num;i++){
			number[i]=scanner.nextInt();
			string[i]=scanner.next();
		}
		scanner.close();
		fullCountingSort(number, string);
	}

}
