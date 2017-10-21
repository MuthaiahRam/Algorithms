package com.hackerrank;

import java.util.Scanner;

public class UtopianTree {
	
	public static void findHeight(int n){
		int result=1;
		if(n==0)
			System.out.println(result);
		else{
		for(int i=1;i<=n;i++){
			if(i%2==0){
				result+=1;
			}
			else{
				result*=2;
			}
		}
		System.out.println(result);
		}
		
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            findHeight(n);
        }
        in.close();
    }

}
