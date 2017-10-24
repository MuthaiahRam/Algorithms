package com.hackerrank;

import java.util.Scanner;

public class RepeatedString {
	
	public static void calculate(String s,long number){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				count++;
				//System.out.println(":"+count);
			}
		}
		long total=(number/s.length())*count;
		//System.out.println("total"+total);
		
		int mod1=(int)(number%(long)s.length());
		if(mod1 !=0){
			
			//System.out.println("prod"+product);
			for(int i=0;i<mod1;i++){
				if(s.charAt(i)=='a'){
					total++;
					//System.out.println(total);
				}
			}
			
		}
		System.out.println(total);
	}
	
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        in.close();
        calculate(s, n);
    }

}
