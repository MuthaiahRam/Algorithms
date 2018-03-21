package com.git.tree;

public class PostOrderTraversal {

	public static void postOrder(Node node) {
		if (node.left != null)
			postOrder(node.left);
		if (node.right != null)
			postOrder(node.right);
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(11);
		root.right = new Node(12);
		root.left.left = new Node(13);
		root.left.right = new Node(14);
		root.right.left = new Node(15);
		PostOrderTraversal.postOrder(root);

	}

}
