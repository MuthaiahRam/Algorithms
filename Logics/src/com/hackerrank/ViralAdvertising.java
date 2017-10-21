package com.hackerrank;

import java.util.Scanner;

public class ViralAdvertising {
	
	public static void calculate(int n){
		int currentLikes=2,totalLikes=2;
		for(int i=0;i<n-1;i++){
			 currentLikes=findLikes(currentLikes);
			 totalLikes+=currentLikes;
		}
		System.out.println(totalLikes);
	}
	
	public static int findLikes(int previousLikes){
		
		return (int) Math.floor((previousLikes*3)/2);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		calculate(scanner.nextInt());
		scanner.close();
	}

}
