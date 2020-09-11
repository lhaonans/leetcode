package com.lhn.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/11 23:01
 */
public class L417太平洋大西洋水流 {
    public static void main(String[] args) {
        int[][] ints = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14},
                {52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 15},
                {51, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 65, 16},
                {50, 95, 132, 133, 134, 135, 136, 137, 138, 139, 140, 107, 66, 17},
                {49, 94, 131, 160, 161, 162, 163, 164, 165, 166, 141, 108, 67, 18},
                {48, 93, 130, 159, 180, 181, 182, 183, 184, 167, 142, 109, 68, 19},
                {47, 92, 129, 158, 179, 192, 193, 194, 185, 168, 143, 110, 69, 20},
                {46, 91, 128, 157, 178, 191, 196, 195, 186, 169, 144, 111, 70, 21},
                {45, 90, 127, 156, 177, 190, 189, 188, 187, 170, 145, 112, 71, 22},
                {44, 89, 126, 155, 176, 175, 174, 173, 172, 171, 146, 113, 72, 23},
                {43, 88, 125, 154, 153, 152, 151, 150, 149, 148, 147, 114, 73, 24},
                {42, 87, 124, 123, 122, 121, 120, 119, 118, 117, 116, 115, 74, 25},
                {41, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 26},
                {40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27}
        };
        List<List<Integer>> lists = new L417太平洋大西洋水流().pacificAtlantic(ints);
        System.out.println(lists);
    }

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
