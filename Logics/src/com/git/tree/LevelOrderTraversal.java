package com.git.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	static Queue<Node> nodes = new LinkedList<Node>();

	public static void levelOrder(Node node) {
		nodes.add(node);
		while (!nodes.isEmpty()) {
			Node n = nodes.poll();
			if (n != null) {
				System.out.println(n.data);
			}
			if (n.left != null) {
				nodes.add(n.left);
			}
			if (n.right != null) {
				nodes.add(n.right);
			}
		}
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(11);
		root.right = new Node(12);
		root.left.left = new Node(13);
		root.left.right = new Node(14);
		root.right.left = new Node(15);
		LevelOrderTraversal.levelOrder(root);

	}

}
