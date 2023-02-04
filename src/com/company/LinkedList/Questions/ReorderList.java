package com.company.LinkedList.Questions;

public class ReorderList {

    // https://leetcode.com/problems/reorder-list/

    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
        {
            return;
        }
        // ListNode mid = middleNode(head);
        ListNode end = revLLiterator(middleNode(head));
        ListNode start = head;
        ListNode temp;

        while(end != null && start != null)
        {
            temp = start.next;
            start.next = end;
            start = temp;
            temp = end.next;
            end.next = start;
            end = temp;
        }

        if(start != null)
        {
            start.next = null;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {

            if(fast.next.next == null)
            {
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public ListNode revLLiterator(ListNode head)
    {

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while (present!=null)
        {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null)
            {
                next = next.next;
            }

        }
        return prev;
    }
}
