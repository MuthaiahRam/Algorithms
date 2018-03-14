package com.epij.arrays;

import java.util.stream.IntStream;

public class SmallIntNotPresent {
	
	public static void main(String[] args) {
		System.out.println(smallestNotPresent());
	}
	
	public static int smallestNotPresent(){
		int array[]={-3,-6,-7};
		
		for(int i=1;i<=IntStream.of(array).max().getAsInt()+1;i++){
			final int value=i;
			if(!IntStream.of(array).anyMatch(x -> x==value)){
				return value;
			}
		}
		return 1;
	}
	

}
