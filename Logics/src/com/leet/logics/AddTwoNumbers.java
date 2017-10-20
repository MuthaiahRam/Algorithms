package com.leet.logics;

import java.math.BigInteger;

public class AddTwoNumbers {
	public static void main(String[] args) {

		ListNode listNode = new ListNode(9);
		//ListNode listNode1 = new ListNode(4);
		//ListNode listNode2 = new ListNode(7);
		//listNode.next = listNode1;
		//listNode1.next = listNode2;
		ListNode listNode3 = new ListNode(1);
		ListNode listNode4 = new ListNode(9);
		ListNode listNode5 = new ListNode(9);
		ListNode listNode6 = new ListNode(9);
		ListNode listNode7 = new ListNode(9);
		ListNode listNode8 = new ListNode(9);
		ListNode listNode9 = new ListNode(9);
		ListNode listNode10 = new ListNode(9);
		ListNode listNode11 = new ListNode(9);
		ListNode listNode12 = new ListNode(9);
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = listNode7;
		listNode7.next = listNode8;
		listNode8.next = listNode9;
		listNode9.next = listNode10;
		listNode10.next = listNode11;
		listNode11.next = listNode12;
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode listNode13 = addTwoNumbers.addTwoNumbers(listNode, listNode3);
		while (listNode13 != null) {
			System.out.println(listNode13.val);
			listNode13 = listNode13.next;
		}

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		BigInteger num = formNumber(l1).add(formNumber(l2));
		StringBuffer buffer = new StringBuffer(String.valueOf(num));
		String result = buffer.reverse().toString();

		ListNode listNode = new ListNode(Integer.valueOf(String.valueOf(result.charAt(0))));
		ListNode head = listNode;
		for (int i = 1; i < result.length(); i++) {

			ListNode node = new ListNode(Integer.valueOf(String.valueOf(result.charAt(i))));
			listNode.next = node;
			listNode = node;
		}
		return head;
	}

	public BigInteger formNumber(ListNode node) {
		StringBuffer number = new StringBuffer();
		ListNode listNode = node;
		if (listNode != null) {
			do {
				number = number.append(String.valueOf(listNode.val));
				listNode = listNode.next;

			} while (listNode != null);
		}
		return new BigInteger(number.reverse().toString());
	}

}
