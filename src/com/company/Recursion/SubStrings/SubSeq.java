package com.company.Recursion.SubStrings;

import java.util.ArrayList;

public class SubSeq {

    public static void main(String[] args) {
//        subseq("","abc");
        ArrayList<String> ans = subseqv2("","abc");
        System.out.println(ans);

    }

    static void subseq(String p , String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // add it
        subseq(p+ch,up.substring(1));

        // ignore it
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqv2(String p , String up)
    {

        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // add it
        ArrayList<String> left = subseqv2(p+ch,up.substring(1));


        ArrayList<String> right = subseqv2(p,up.substring(1));
        // ignore it

        left.addAll(right);
        return left;


    }
}
