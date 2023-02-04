package com.company.LinkedList.Questions;

public class RorateList {
    // https://leetcode.com/problems/rotate-list/description/
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode pointer = head;
        int size = 1;
        ListNode newlast=head;
        while(pointer.next != null)
        {
            pointer = pointer.next;
            size++;
        }
        pointer.next = head;
        int rotations = k % size;
        int skip = size - rotations;
        for(int i =0 ; i< skip - 1; i++)
        {
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
        return head;
    }
}
