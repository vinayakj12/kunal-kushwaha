package com.company.Recursion.SubStrings;

public class SkipChar {

    public static void main(String[] args) {
            skipv1("","baccda");
            String p = "abbcba";
             System.out.println(skipv2(p));

    }

    static void skipv1(String p, String up)
    {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch=='a')
        {
            skipv1(p,up.substring(1));
        }
        else {
            skipv1(p+ch,up.substring(1));
        }
    }

    static String skipv2(String p)
    {
        if (p.isEmpty()){

            return "";
        }

        char ch = p.charAt(0);

        if (ch=='a')
        {
            return "" + skipv2(p.substring(1));
        }
        else {
            return ch + skipv2(p.substring(1));
        }
    }

    static String skipString(String p)
    {
        if (p.isEmpty()){

            return "";
        }



        if (p.startsWith("apple"))
        {
            return skipv2(p.substring(5));
        }
        else {
            return p.charAt(0) + skipv2(p.substring(1));
        }
    }



}
