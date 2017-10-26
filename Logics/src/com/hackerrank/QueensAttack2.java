package com.hackerrank;

import java.util.Scanner;

public class QueensAttack2 {
	static int majord_up = 0,majord_down = 0,minord_up = 0,minord_down = 0,n=0;
	static int rowright = 0,rowleft = 0,colup = 0,coldown = 0, countofNotReachable = 0;

	public static int calculateTotal(int num) {
		n=num;
		return (n - 1) * 3 + (n - 2);

	}

	public static int calculateNotReachable(int rQueen, int cQueen, int rObstacle, int cObstacle) {
		
		if(rObstacle==rQueen){
			if(cObstacle>cQueen){
				rowright=rowright> Math.min(rowright, Math.abs(n-cQueen))?
				countofNotReachable= Math.abs(n-cQueen)+1; 
				
			}
			else{
				countofNotReachable= Math.abs(1-cQueen)+1;
			}
		}

		if(cObstacle==cQueen){
			if(rObstacle>rQueen){
				countofNotReachable= Math.abs(n-rQueen)+1; 
			}
			else{
				countofNotReachable= Math.abs(1-rQueen)+1;
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int rQueen = in.nextInt();
		int cQueen = in.nextInt();
		for (int a0 = 0; a0 < k; a0++) {
			int rObstacle = in.nextInt();
			int cObstacle = in.nextInt();
			// your code goes here
		}
		in.close();
	}

}
