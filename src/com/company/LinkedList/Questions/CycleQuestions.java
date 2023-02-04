package com.company.LinkedList.Questions;

//https://leetcode.com/problems/linked-list-cycle/submissions/886912123/
public class CycleQuestions {

    public boolean hasCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;

        while (fast!= null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
            {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle

    public int lengthCycle(ListNode head)
    {
        int size = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast!= null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
            {
                // calculate the length
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    size++;
                }while (temp != slow);
                return size;
            }
        }
        return 0;
    }
    //https://leetcode.com/problems/linked-list-cycle-ii/submissions/887424794/
    public ListNode listCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                ListNode entry = head;
                while(entry!= slow)
                {
                    entry =entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x)
    {
        val = x;
        next = null;
    }
}
