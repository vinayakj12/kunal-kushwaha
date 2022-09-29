package com.company.LinearSearch;

import com.sun.source.tree.ReturnTree;

public class RichestWealth {

    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
             int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum>max)
            {
                max = sum;
            }
        }
        return max;
    }
}
