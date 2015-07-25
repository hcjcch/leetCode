package com.hcjcch.RemoventhnodefromendofList;

import java.util.Stack;

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

        //计算链表长度
        ListNode node = head;
        int length = 1;
        while (node != null) {
            node = node.next;
            length++;
        }

        int position = length - n;
        //第一个处理
        if (position == 1) {
            return returnNode.next;
        }
        //其余情况处理
        int i = 0;
        for (node = head; node != null; node = node.next) {
            i++;
            if (i == position) {
                temp.next = node.next;
            }
            temp = temp.next;
        }
        return returnNode;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {

        ListNode temp = new ListNode(1);
        Stack<ListNode> stack = new Stack<ListNode>();
        Stack<ListNode> stack1 = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int i = 1;
        while (!stack.isEmpty()) {
            if (i != n) {
                stack1.push(stack.peek());
            }
            stack.pop();
            i++;
        }
        ListNode re = temp;
        while (!stack1.isEmpty()) {
            temp.next = new ListNode(stack1.pop().val);
            temp = temp.next;
        }
        return re.next;
    }

    public static ListNode removeNthFromEnd3(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        ListNode first = head;
        temp.next = head;
        ListNode re = temp.next;
        ListNode second = head;
        int i;
        for (i = 0; second != null; i++) {
            if (i != n) {
                second = second.next;
            } else {
                break;
            }
        }
        if (second == null) {
            return re.next;
        }

        while (second != null) {
            temp = temp.next;
            second = second.next;
            first = first.next;
        }
        temp.next = first.next;
        return re;
    }

    public static void main(String[] args) {
//        outNode(removeNthFromEnd(generateNode(), 2));
//        outNode(removeNthFromEnd2(generateNode(), 1));
        outNode(removeNthFromEnd3(generateNode(), 5));
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