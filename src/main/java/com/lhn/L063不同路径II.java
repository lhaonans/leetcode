package com.lhn;

/**
 * @author lhn
 * @date 2020/9/10 22:49
 */
public class L063不同路径II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int[][] steps = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            steps[i][0] = 1;
        }

        for (int i = 0; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            steps[0][i] = 1;
        }


        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] != 1) {
                    steps[i][j] = steps[i - 1][j] + steps[i][j - 1];
                }
            }
        }
        return steps[steps.length - 1][steps[0].length - 1];
    }
}
