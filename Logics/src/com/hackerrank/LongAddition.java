package com.hackerrank;

public class LongAddition {
	static long aVeryBigSum(int n, long[] ar) {
        long sum=0;
        while(n>0){
        	sum+=ar[--n];
        }
        return sum;
    }

}
