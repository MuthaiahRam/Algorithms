package com.epij.arrays;

public class Demo {
	public static int solution(int A, int B, int N){
		if(N==0)return A;
		if(N==1)return B;
		  int f[] = new int[N+1];
		  fib(N,f);
		return (f[N-1]*A+f[N]*B)%1000000007;
		 
	}
	 static int fib(int n,int f[])
	    {
	       
	   
	    int i;
	      
	   
	    f[0] = 0;
	    f[1] = 1;
	     
	    for (i = 2; i <= n; i++)
	    {
	     
	        f[i] = f[i-1] + f[i-2];
	    }
	      
	    return f[n];
	    }
	 public static void main(String[] args) {
			System.out.println(solution(55, 777, 0));
		}
	
}
