package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ElectronicShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int s){
        int max=0;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        for(int i=0;i<keyboards.length && keyboards[i]<s;i++){
        	for(int j=0;j<drives.length;j++){
        		int total=keyboards[i]+drives[j];
        		if(total<=s){
        			if(total>max){
        			max=total;
        		}
        		}
        		else{
        			break;
        		}
        		
        	}
        }
		if(max ==0){
			max = -1;
		}
		return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        in.close();
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
