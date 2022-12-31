package com.company.Backtracking;

public class Sudoko {

    public static void main(String[] args) {
        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };
        solveSudoku(board);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();

    }


}

    private static boolean solveSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.')
                {
                    for (char c = '1'; c < '9'; c++) {
                        if (isValid(board,i,j,c))
                        {
                            board[i][j] = c;
                            if (solveSudoku(board) == true)
                            {
                                return true;
                            }
                            // backtraking as wrong solution found by putting the right one
                            else {
                                board[i][c] = '.';
                             }
                        }
                        return false;
                    }
                }
            }

        }
        // basically the base condition when all the values are filled up
        return true;

    }

    static boolean isValid(char[][] board, int row, int col, char num)
    {

        for (int i = 0; i < 9; i++) {

            // check for row
            if (board[i][col] == num) {
                return false;
            }

            // check for column
            if (board[row][i] == num) {
                return false;
            }

            // chech for 3* 3 matrix
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num)
                return false;
        }

        return true;

    }
    }
