package com.lhn.dfs;

/**
 * @author lhn
 * @date 2020/9/10 23:12
 */
public class L463岛屿的周长 {
    public int islandPerimeter(int[][] grid) {
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
            return 1;
        }
        if (grid[r][c] == 0) {
            return 1;
        }
        if (grid[r][c] != 1) {
            return 0;
        }
        grid[r][c] = 2;

        return area(grid, r - 1, c) + area(grid, r + 1, c) + area(grid, r, c - 1) + area(grid, r, c + 1);

    }
}
