package com.leet.logics;

public class NumberCompliment {

	public static int findComplement(int num) {
				
		return ~num & ((1<<(int)Math.floor(Math.log(num)/Math.log(2))+1)-1); //masking for bit length
		
	}
	public static void main(String[] args) {
		System.out.println(findComplement(2));
	}

}
