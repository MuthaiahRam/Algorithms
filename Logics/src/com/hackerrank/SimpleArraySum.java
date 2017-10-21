package com.hackerrank;

public class SimpleArraySum {
	
	static int simpleArraySum(int n, int[] ar) {
        int sum=0;
		while(n>0){
        	sum+=ar[--n];
        	
        }
		return sum;
    }
	
	
	
	public static void main(String[] args) {
		System.out.println(simpleArraySum(5,new int[]{1,2,3,4,5}));
	}

}
