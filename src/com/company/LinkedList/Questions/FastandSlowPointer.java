package com.company.LinkedList.Questions;

public class FastandSlowPointer {

    // ? HAPPY NUMBER QUESTION
    //https://leetcode.com/problems/happy-number/submissions/887575677/

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1)
        {
            return true;
        }
        return false;
    }

    public int findSquare(int n)
    {
        int ans = 0;
        while(n > 0)
        {
            int rem = n % 10;
            ans += rem * rem;
            n = n/10;
        }
        return ans;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/
    // ? MIDDLE OF THE LINKED LIST
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

}
