package com.company.Backtracking;

import java.util.ArrayList;

public class Basics {

    public static void main(String[] args) {

//        System.out.println( printPathRetDiagonal("",3,3) );

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true,true, true}
        };

        pathRestrictions("",board,0,0);
    }


    // ! COUNTING PATH
    static int countPath(int r,int c)
    {
        if (r == 1 || c == 1)
        {
            return 1;
        }
        int left = countPath(r-1,c);
        int right = countPath(r,c-1);
        return left + right;
    }

    // ! PRINT PATH
    static void printPath(String p,int r,int c)
    {
        if (r == 1 && c == 1)
        {
            System.out.println(p);
            return ;
        }
        if (r > 1)
        {
            printPath(p+'D',r-1,c);
        }
        if (c> 1)
        {
            printPath(p+'R',r,c-1);
        }

    }

    // ! PRINT PATH AND LIST RETURN
    static ArrayList<String> printPathRet(String p, int r, int c)
    {
        if (r == 1 && c == 1)
        {
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1)
        {
            list.addAll(printPathRet(p+'D',r-1,c));
        }
        if (c> 1)
        {
            list.addAll(printPathRet(p+'R',r,c-1));
        }

        return list;

    }

    //! PRINT PATH ALONG WITH DIAGONAL
    static ArrayList<String> printPathRetDiagonal(String p, int r, int c)
    {
        if (r == 1 && c == 1)
        {
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        // going vertical
        if (r > 1)
        {
            list.addAll(printPathRetDiagonal(p+'V',r-1,c));
        }

        // going Diagonal
        if (r>1 && c>1){
            list.addAll(printPathRetDiagonal(p+'D',r-1,c-1));
        }

        // going horizontal
        if (c> 1)
        {
            list.addAll(printPathRetDiagonal(p+'H',r,c-1));
        }

        return list;

    }

    // ! PATH WITH RESTRICTIONS

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

        if (r < board.length - 1)
        {
            pathRestrictions(p+'D', board, r+1,c);
        }
        if (c <  board[0].length - 1)
        {
            pathRestrictions(p+'R', board, r,c+1);
        }


    }

}
