package com.lhn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhn
 * @date 2020/9/10 22:48
 */
public class L054螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> integers = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return integers;
        }

        int left = 0;
        int right = matrix[0].length - 1;
        int upper = 0;
        int down = matrix.length - 1;


        while (left <= right && upper <= down) {
            for (int i = left; i <= right; i++) {
                integers.add(matrix[upper][i]);
            }

            for (int i = upper + 1; i <= down; i++) {
                integers.add(matrix[i][right]);
            }

            if (left < right && upper < down) {
                for (int i = right - 1; i > left; i--) {
                    integers.add(matrix[down][i]);
                }

                for (int i = down; i > upper; i--) {
                    integers.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            upper++;
            down--;
        }
        return integers;
    }
}
