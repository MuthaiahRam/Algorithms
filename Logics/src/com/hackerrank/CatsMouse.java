package com.hackerrank;

import java.util.Scanner;

public class CatsMouse {
	
	public static void calculate(int cat1,int cat2,int mouse){
		int cat1mouse=Math.abs(cat1 - mouse);
		int cat2mouse=Math.abs(cat2-mouse);
		if(cat1mouse == cat2mouse){
			System.out.println("Mouse C");
		}
		else if(cat1mouse < cat2mouse){
			System.out.println("Cat A");
		}
		else{
			System.out.println("Cat B");
		}
	}
	
	
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            calculate(x, y, z);
        }
        in.close();
    }

}
