package com.leet.logics;

import java.util.LinkedList;
import java.util.Queue;

public class MergeBinaryTrees {

	static Queue<TreeNode> nodes = new LinkedList<TreeNode>();

	public static TreeNode[] mergeTrees(TreeNode t1, TreeNode t2) {

		int maxHeight = Math.max(findHeight(t1), findHeight(t2));
		TreeNode[] treeArray = new TreeNode[(int) Math.pow(2, maxHeight + 1) - 1];
		levelOrder(t1, treeArray);
		levelOrder(t2, treeArray);
		return createLinks(treeArray);
	}

	public static TreeNode[] createLinks(TreeNode[] treeNodes) {
		for (int i = 0; i < treeNodes.length / 2; i++) {
			if (treeNodes[i] != null) {
				treeNodes[i].left = treeNodes[(2 * i) + 1];
				treeNodes[i].right = treeNodes[(2 * i) + 2];
			}
		}
		return treeNodes;
	}

	public static int findHeight(TreeNode node) {
		int leftSum = 0, rightSum = 0;
if(node!=null){
		if (node.left != null)
			leftSum = 1 + findHeight(node.left);
		if (node.right != null)
			rightSum = 1 + findHeight(node.right);
}
		return Math.max(leftSum, rightSum);
	}

	public static void levelOrder(TreeNode node, TreeNode[] treeNodes) {
		int counter = 0;

		nodes.add(node);
		while (counter < treeNodes.length) {

			TreeNode n = nodes.poll();
			TreeNode nodeInArray = treeNodes[counter];
			if (nodeInArray != null) {

				if (n != null)
					nodeInArray.val += n.val;

			} else {

				nodeInArray = n;

			}
			treeNodes[counter] = nodeInArray;
			counter++;
			if (n != null && n.left != null) {
				nodes.add(n.left);
			} else {
				nodes.add(null);
			}
			if (n != null && n.right != null) {
				nodes.add(n.right);
			} else {
				nodes.add(null);
			}
		}
		nodes.clear();
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(5);
		TreeNode root1 = new TreeNode(2);
		root1.left = new TreeNode(1);
		root1.right = new TreeNode(3);
		root1.left.right = new TreeNode(4);
		root1.right.right = new TreeNode(7);
		levelOrderPrint(mergeTrees(root, root1));

	}

	public static void levelOrderPrint(TreeNode[] node) {
		for (int i = 0; i < node.length; i++) {
			if (node[i] != null)
				System.out.println(node[i].val);
			else
				System.out.println("null");
		}
	}

}
