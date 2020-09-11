package com.lhn.dfs;

/**
 * @author lhn
 * @date 2020/9/10 22:52
 */
public class L079单词搜索 {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (area(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean area(char[][] board, String word, int r, int c, int k) {

        if (k >= word.length()) {
            return true;
        }

        boolean isArea = r >= 0 && r < board.length && c >= 0 && c < board[0].length;
        if (!isArea) {
            return false;
        }

        if (board[r][c] != word.charAt(k)) {
            return false;
        }
        board[r][c] += 256;

        boolean res = area(board, word, r - 1, c, k + 1) ||
                area(board, word, r + 1, c, k + 1) ||
                area(board, word, r, c - 1, k + 1) ||
                area(board, word, r, c + 1, k + 1);
        board[r][c] -= 256;

        return res;
    }
}
