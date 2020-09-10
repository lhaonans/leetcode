package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:45
 */
public class L048旋转图像 {
    public void rotate(int[][] matrix) {
        int temp;
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][length - j - 1];
                matrix[i][length - j - 1] = temp;
            }
        }
    }
}
