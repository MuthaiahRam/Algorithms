package com.hackerrank;

import java.util.Scanner;

public class AppleOrange {

	static void count(int apple[], int orange[], int s, int t, int a, int b, int m, int n) {

		int appleCount = 0, orangeCount = 0;
		while (m > 0) {
			if (apple[--m] > 0) {
				int appleSpot = apple[m] + a;
				if (appleSpot >= s && appleSpot <= t) {
					appleCount++;
				}
			}
		}
		while (n > 0) {
			if (orange[--n] < 0) {
				int orangeSpot = b- Math.abs(orange[n]);
				if (orangeSpot >= s && orangeSpot <= t) {
					orangeCount++;
				}
			}
		}
		System.out.println(appleCount);
		System.out.print(orangeCount);

	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        in.close();
        count(apple, orange, s, t, a, b, m, n);
    }

}
