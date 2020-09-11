package com.lhn.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/8/24 10:09
 */
public class L051N皇后 {

    public List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        backtrack(board, 0);
        return res;
    }

    public List<String> boardToList(int[][] board) {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    stringBuilder.append('.');
                } else {
                    stringBuilder.append('Q');
                }
            }
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    public void backtrack(int[][] board, int row) {
        if (row == board.length) {
            res.add(boardToList(board));
            return;
        }
        for (int col = 0; col < board[row].length; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            board[row][col] = 1;
            backtrack(board, row + 1);
            board[row][col] = 0;
        }
    }

    public boolean isValid(int[][] board, int row, int col) {
        int n = board.length;
        // 检查列是否有皇后互相冲突
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 1)
                return false;
        }
        // 检查右上方是否有皇后互相冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }
        // 检查左上方是否有皇后互相冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }

}
