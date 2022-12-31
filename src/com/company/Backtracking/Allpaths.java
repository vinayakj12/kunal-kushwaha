package com.company.Backtracking;

import java.util.Arrays;

public class Allpaths {

    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true,true, true}
        };
        int[][] path = new int[board.length][board[0].length];

        pathAndMatrix("",board,0,0,path,1);

    }

    static void pathRestrictions(String p, boolean[][] board, int r, int c)
    {
        if (r == board.length-1 && c == board[0].length -1)
        {
            System.out.println(p);
            return ;
        }

        if (!board[r][c])
        {
            return;
        }

        // i am considering this block in my path
        board[r][c] = false;

        // Down direction
        if (r < board.length - 1)
        {
            pathRestrictions(p+'D', board, r+1,c);
        }

        // right direction
        if (c <  board[0].length - 1)
        {
            pathRestrictions(p+'R', board, r,c+1);
        }

        // up direction
        if (r > 0)
        {
            pathRestrictions(p+'U', board, r-1,c);
        }

        // left direction
        if (c >  0)
        {
            pathRestrictions(p+'L', board, r,c-1);
        }

        // THIS LINE IS WHERE THE FUNCTION WILL BE OVER
        // SO BEFORE THE FUCNTION GETS REMOVED ALSO REMOVE THE CHANGES THAT CALL MAKE
        board[r][c] = true;
        // revert the change when that work is done.
        // if you are returning back from the path do not mark that visited.
    }

    static void pathAndMatrix(String p, boolean[][] board, int r, int c,int[][] path,int step)
    {
        if (r == board.length-1 && c == board[0].length -1)
        {
            // this last step to reach the destination will also be the step
            path[r][c] =step;
            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }

        if (!board[r][c])
        {
            return;
        }

        // i am considering this block in my path
        board[r][c] = false;
        path[r][c] =step;

        // Down direction
        if (r < board.length - 1)
        {
            pathAndMatrix(p+'D', board, r+1,c,path,step+1);
        }

        // right direction
        if (c <  board[0].length - 1)
        {
            pathAndMatrix(p+'R', board, r,c+1,path,step+1);
        }

        // up direction
        if (r > 0)
        {
            pathAndMatrix(p+'U', board, r-1,c,path,step+1);
        }

        // left direction
        if (c >  0)
        {
            pathAndMatrix(p+'L', board, r,c-1,path,step+1);
        }

        // THIS LINE IS WHERE THE FUNCTION WILL BE OVER
        // SO BEFORE THE FUCNTION GETS REMOVED ALSO REMOVE THE CHANGES THAT CALL MAKE
        board[r][c] = true;
        path[r][c] = 0;
        // revert the change when that work is done.
        // if you are returning back from the path do not mark that visited.
    }
}
