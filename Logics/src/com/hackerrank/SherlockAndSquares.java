package com.hackerrank;

import java.util.Scanner;

public class SherlockAndSquares {
	
	public static void findSquares(int from,int to){
		int root2=(int)Math.sqrt(to),root1=(int)Math.ceil(Math.sqrt(from));
		int result=(root2-root1)+1;
		result=result>0?result:0;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int iterations=scanner.nextInt();
		for(int i=0;i<iterations;i++){
			findSquares(scanner.nextInt(), scanner.nextInt());
		}
		scanner.close();
	}

}
