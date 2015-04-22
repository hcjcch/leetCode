package com.hcjcch.linked;

import java.util.ArrayList;

/**
 * Created by hcjcch on 2015/4/16.
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while (pre != null && pre.next != null && pre.next.next != null) {
            ListNode q = pre.next;
            ListNode r = q.next;
            pre.next = r;
            q.next = r.next;
            r.next = q;
            pre = pre.next.next;
        }
        return dummyHead.next;

    }

    public static void main(String[] args) {
        ListNode list = ListUtils.makeList(1, 2, 3, 4, 5);
        ListUtils.printList(list);
        //ListUtils.printList(new Solution().swapPairs(list));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class ListUtils {
    public static ListNode makeList(Integer... array) {
        ArrayList<ListNode> nodes = new ArrayList<ListNode>(array.length);
        for (int i = 0; i < array.length; i++) {
            nodes.add(i, new ListNode(array[i]));
        }
        for (int i = 0; i < array.length - 1; i++) {
            nodes.get(i).next = nodes.get(i + 1).next;
        }
        return nodes.get(0);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "   ");
            head = head.next;
        }
    }
}