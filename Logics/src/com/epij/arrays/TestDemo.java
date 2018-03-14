package com.epij.arrays;

public class TestDemo {
	 static int n1=0,a=0;
	public static int solution(int A, int B, int N){
		
		
		n1=Fibonacci(N-1);
		System.out.println(n1);
		a=Fibonacci(N);
		System.out.println(a);
		return (n1*A+a*B)%1000000007;
	}
	public static int Fibonacci(int n){
		
		if (n <= 1)
		      return n;
		
		    return Fibonacci(n-1) + Fibonacci(n-2);
	}
	public static void main(String[] args) {
		System.out.println(solution(3, 4, 5));
	}

}
