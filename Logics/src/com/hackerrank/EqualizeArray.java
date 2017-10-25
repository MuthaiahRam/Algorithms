package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class EqualizeArray {

	public static void delete(int array[]) {
		Arrays.sort(array);
		int max = 0, count = 1, num = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] == num) {
				count++;
			} else {
				count = 1;
				num = array[i];
			}
			max = max < count ? count : max;
		}
		System.out.println(array.length - max);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num= scanner.nextInt();
		int array[]=new int[num];
		for(int i=0;i<num;i++){
			array[i]=scanner.nextInt();
		}
		delete(array);

	}

}
