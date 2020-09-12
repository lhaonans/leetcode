package com.lhn.数组;

/**
 * @author lhn
 * @date 2020/9/12 10:32
 */
public class L240搜索二维有序数组 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length - 1;
        int c = 0;

        while (r >= 0 && c < matrix[0].length) {
            if (matrix[r][c] > target) {
                r--;
            } else if (matrix[r][c] < target) {
                c++;
            } else {
                return true;
            }
        }
        return false;
    }
}
