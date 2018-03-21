package com.git.tree;

public class PreOrderTraversal {
	
	public static void preOrder(Node node){
		System.out.println(node.data);
		if(node.left!=null)
		preOrder(node.left);
		if(node.right!=null)
		preOrder(node.right);
	}

	
	
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(11);
		root.right = new Node(12);
		root.left.left = new Node(13);
		root.left.right = new Node(14);
		root.right.left = new Node(15);
		PreOrderTraversal.preOrder(root);

	}
}
