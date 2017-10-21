package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	static BigInteger factorial(int number){
		while(number > 2){
			return BigInteger.valueOf(number).multiply(factorial(number-1));
			
		}
		return BigInteger.valueOf(number);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       System.out.println(factorial(n));
        in.close();
    }
}
