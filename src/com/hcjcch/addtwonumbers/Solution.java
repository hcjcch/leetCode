package com.hcjcch.addtwonumbers;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode p3 = newHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            p3.next = new ListNode(carry % 10);
            p3 = p3.next;
            carry = carry / 10;
        }
        if (carry == 1) {
            p3.next = new ListNode(1);
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(8);
        a1.next = a2;
        ListNode b1 = new ListNode(0);
        ListNode listNode = addTwoNumbers(a1, b1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}