package com.git.tree;

public class InOrderTraversal {
	
	
	public static void inOrder(Node node){
		if(node.left!=null)
		inOrder(node.left);
		System.out.println(node.data);
		if(node.right!=null)
		inOrder(node.right);
	}
	
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(11);
		root.right=new Node(12);
		root.left.left=new Node(13);
		root.left.right=new Node(14);
		root.right.left=new Node(15);
		InOrderTraversal.inOrder(root);
		
		
		
	}

}
