package com.hcjcch.RemoventhnodefromendofList;

/**
 * Created by hcjcch on 15/7/25.
 */
public class Solution {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(2);
        temp.next = head;
        ListNode returnNode = temp.next;
        ListNode node = head;
        int length = 1;
        while (node != null) {
            node = node.next;
            length++;
        }

        int position = length - n;
        if (position == 1){
            return returnNode.next;
        }
        int i = 0;
        for (node = head; node != null; node = node.next) {
            i++;
            if (i == position){
                temp.next = node.next;
            }
            temp = temp.next;
        }
        return returnNode;
    }

    public static void main(String[] args) {
        outNode(removeNthFromEnd(generateNode(),5));
    }

    public static void outNode(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode generateNode() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return node1;
    }
}