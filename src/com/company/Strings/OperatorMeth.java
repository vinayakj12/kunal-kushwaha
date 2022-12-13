package com.company.Strings;

import java.util.ArrayList;

public class OperatorMeth {

    public static void main(String[] args) {

//        System.out.println("a" + 1);
        // integer will be converted to Integer that will call toString()

        // java will call tostring on objects to convert it into string

        // ! error + operator should work with one primitive and one object or objects and string.
        // System.out.println(new Integer(56) + new ArrayList<>());

        // method overloading in java is present in the println according to arguments passed.

        // * method overriding is present in the tostring for default object with arrays.tostring

        // + operator in java is overloaded to perform string concatation.

        // ? STRING  BUILDER

        // it is used as the strings are immutable and the addition leads to creation of new objects
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);


    }
}
