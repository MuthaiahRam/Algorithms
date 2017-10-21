package com.hackerrank;

import java.util.Scanner;

public class BreakRecord {

	 static void getRecord(int[] s){
	        int low=s[0],lowCount=0,max=s[0],maxCount=0;
	        for(int i=1;i<s.length;i++){
	        	if(s[i]<low){
	        		lowCount++;
	        		low=s[i];
	        	}
	        	else if(s[i]>max){
	        		maxCount++;
	        		max=s[i];
	        	}
	        }
	        System.out.println(maxCount +" "+lowCount);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] s = new int[n];
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.nextInt();
	        }
	        in.close();
	        getRecord(s);
	        
	    }
}
