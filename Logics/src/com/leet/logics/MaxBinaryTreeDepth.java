package com.leet.logics;

public class MaxBinaryTreeDepth {
	
	public class TreeNode {
		     int val;
		    TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	int depth =0;
	 public int maxDepth(TreeNode root) {
		 
		if(root != null) {
			depth++;
		}
		else{
			return depth;
		}
		
		 
		 
		 return 0;
	        
	    }

}
