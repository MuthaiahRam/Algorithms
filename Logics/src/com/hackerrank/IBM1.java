package com.hackerrank;

public class IBM1 {
	
	

	public static void main(String[] args) {
		int m=4,n=4,k=2,l=2;
		int arr[][]= {{1, 2, -1, -4},
                {-8, -3, 4, 2},
                {3, 8, 10, 1},
                {-4, -1, 1, 7}};
		
		for(int k1=0;k1<m/k;k1++){
			for(int k2=0;k2<n/k;k2++){
		
		int winowMax=Integer.MIN_VALUE;
		for(int i=0;i<k1+k;i++){
			for(int j=0;j<l+k2;j++){
			if(winowMax<arr[i][j]){
				winowMax=arr[i][j];
			}
			}
		}
		System.out.println(winowMax);
	}
}
	
	
}
}
