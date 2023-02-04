package com.company.LinkedList.Questions;

public class PalindromeLL {

    //https://leetcode.com/problems/palindrome-linked-list/submissions/888863662/

    // CODE DOESN'T WORKS ON INTELLIJ IDEA ADDITIONAL CLASSES NEEDED.
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode firstHead = head;
            ListNode mid = middleNode(head);
            ListNode secondHead = revLLiterator(mid);
            ListNode revHead = secondHead;

            while(firstHead != null && secondHead != null)
            {
                if(firstHead.val != secondHead.val)
                {
                    break;
                }
                firstHead = firstHead.next;
                secondHead = secondHead.next;

            }

            revLLiterator(revHead);

            if(firstHead == null || secondHead == null)
            {
                return true;
            }
            return false;


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
}
