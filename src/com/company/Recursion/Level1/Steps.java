package com.company.Recursion.Level1;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/861577121/
public class Steps {

    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    public int helper(int n, int c)
    {
        if(n==0)
        {
            return c;
        }

        if(n%2==0)
        {
            return helper(n/2,c+1);
        }
        return helper(n-1,c+1);


    }

}
