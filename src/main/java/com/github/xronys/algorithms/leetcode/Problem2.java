package com.github.xronys.algorithms.leetcode;

import java.io.IOException;

public class Problem2 {
    public static ListNode addTwoNumbers( ListNode l1, ListNode l2 ) {
        int digit = 0;
        ListNode current = new ListNode();
        ListNode first = current;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + digit;
            digit = val/10;
            current.val = val % 10;
            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null && l2 != null) {
                ListNode next = new ListNode();
                current.next = next;
                current = next;
            }
        }
        while (l1 != null) {
            ListNode next = new ListNode();
            current.next = next;
            current = next;
            int val = l1.val;
            if (digit > 0) {
                val++;
                digit--;
            }
            if (val > 9) {
                current.val = val % 10;
                digit++;
            } else {
                current.val = val;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode next = new ListNode();
            current.next = next;
            current = next;
            int val = l2.val;
            if (digit > 0) {
                val++;
                digit--;
            }
            if (val > 9) {
                current.val = val % 10;
                digit++;
            } else {
                current.val = val;
            }
            l2 = l2.next;
        }
        if (digit > 0) {
            current.next= new ListNode(1);
        }
        return first;
    }

    public static void main( String[] args ) throws IOException {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        ListNode result = addTwoNumbers(node1, node4);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode( int val ) {
            this.val = val;
        }

        ListNode( int val, ListNode next ) {
            this.val = val;
            this.next = next;
        }

    }
}
