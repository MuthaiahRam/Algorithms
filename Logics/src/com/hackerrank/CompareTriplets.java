package com.hackerrank;

public class CompareTriplets {
	static int alice=0,bob=0;
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        
       compare(a0, b0);
       compare(a1,b1);
       compare(a2,b2);
       return new int[]{alice,bob};
        
    }
	static void compare(int alice,int bob){
		 if(alice>bob){
	        	++CompareTriplets.alice;
	        }
	        else if(alice<bob){
	        	++CompareTriplets.bob;
	        }
	}
	
	

}
