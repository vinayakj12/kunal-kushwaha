package com.company.funcMeth;

import java.util.Arrays;

public class VarArgs {

    /* variable length arguments { not knowing the number of the arguments to be passed} */

    public static void main(String[] args) {

        fun(2,3,4,5);

    }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

}
