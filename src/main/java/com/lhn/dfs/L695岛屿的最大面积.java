package com.lhn.dfs;

/**
 * @author lhn
 * @date 2020/8/23 12:47
 */
public class L695岛屿的最大面积 {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res = Math.max(res, area(grid, i, j));
            }
        }
        return res;
    }

    public int area(int[][] grid, int r, int c) {
        boolean isArea = r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;

        if (!isArea) {
            return 0;
        }
        if (grid[r][c] != 1) {
            return 0;
        }
        grid[r][c] = 2;

        return 1 + area(grid, r - 1, c) + area(grid, r + 1, c) + area(grid, r, c - 1) + area(grid, r, c + 1);

    }
}
