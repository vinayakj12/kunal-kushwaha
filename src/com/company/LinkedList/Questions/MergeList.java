package com.company.LinkedList.Questions;
import com.company.LinkedList.LL;

public class MergeList {

    //https://leetcode.com/problems/merge-two-sorted-lists/
    public static LL merge(LL first,LL second)
    {
        LL.Node f = first.getHead();
        LL.Node s = second.getHead();

        LL ans = new LL();
        while (f!= null && s!= null)
        {
            if (f.getValue() < s.getValue())
            {
                ans.insertAtLast(f.getValue());
                f = f.getNext();
            }else {
                ans.insertAtLast(s.getValue());
                s = s.getNext();
            }
        }

        // anyone of the list will become empty
        while (f!= null)
        {
            ans.insertAtLast(f.getValue());
            f= f.getNext();}

        while (s!= null)
        {
            ans.insertAtLast(s.getValue());
            s = s.getNext();
        }

        return ans;
    }




    public static void main(String[] args) {

        LL first = new LL();
        LL second = new LL();

        first.insertAtLast(1);
        first.insertAtLast(3);
        first.insertAtLast(5);

        second.insertAtLast(1);
        second.insertAtLast(2);
        second.insertAtLast(9);
        second.insertAtLast(14);

        LL ans = merge(first,second);
        ans.display();
    }



}
