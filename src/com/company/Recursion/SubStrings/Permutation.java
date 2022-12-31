package com.company.Recursion.SubStrings;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {

    }

    static void permutaions(String p, String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        // here we have variable number of recrsion call at differnt level that depend on [proces
        char ch = up.charAt(0);
        for (int i = 0; i < p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutaions(f+ch+s,up.substring(1));
        }

    }

    static ArrayList<String> permutaionsList(String p, String up)
    {
        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String > ans = new ArrayList<>();
        // here we have variable number of recrsion call at differnt level that depend on [proces
        char ch = up.charAt(0);
        for (int i = 0; i < p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutaionsList(f+ch+s,up.substring(1)));
        }

        return ans;

    }
}
