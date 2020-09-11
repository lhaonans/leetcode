package com.lhn.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/11 23:01
 */
public class L417太平洋大西洋水流 {

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                boolean dfs = dfs(matrix, i, j, Integer.MAX_VALUE, true) && dfs(matrix, i, j, Integer.MAX_VALUE, false);
                if (dfs) {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(i);
                    integers.add(j);
                    lists.add(integers);
                }
            }
        }
        return lists;
    }


    private boolean dfs(int[][] matrix, int r, int c, int pre, boolean which) {
        boolean isArea = r >= 0 && r < matrix.length && c >= 0 && c < matrix[0].length;
        if (!isArea) {
            return false;
        }
        if (matrix[r][c] == -1) {
            return false;
        }
        if (pre < matrix[r][c]) {
            return false;
        }

        if (which && (r == 0 || c == 0)) {
            return true;
        }
        if (!which && (r == matrix.length - 1 || c == matrix[0].length - 1)) {
            return true;
        }

        int temp = matrix[r][c];
        matrix[r][c] = -1;
        boolean up = dfs(matrix, r - 1, c, temp, which);
        boolean down = dfs(matrix, r + 1, c, temp, which);
        boolean left = dfs(matrix, r, c - 1, temp, which);
        boolean right = dfs(matrix, r, c + 1, temp, which);
        matrix[r][c] = temp;
        return up || down || left || right;
    }
}
