package com.hackerrank;

import java.util.Scanner;

public class AngryProfessor {
	
	public static boolean isCancelled(int[] a,int k,int n){
		int trueCount=0,falseCount=0;
		for(int i=0;i<n;i++){
			if(a[i]<=0){
				trueCount++;
			}
			else{
				falseCount++;
			}
			if(trueCount>=k){
				return true;
			}
			else if(falseCount>n-k){
				return false;
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            
            if(!isCancelled(a, k, n))
            	System.out.println("YES");
            else
            	System.out.println("NO");
            
        }
      in.close();
    }
}
