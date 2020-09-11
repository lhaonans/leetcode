package com.lhn.dfs;

/**
 * @author lhn
 * @date 2020/9/11 10:02
 */
public class B001最长水沟 {

    public int maxDitch(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res = Math.max(res, dfs(grid, i, j, Integer.MAX_VALUE, 0));
            }
        }
        return res;
    }

    public int dfs(int[][] grid, int r, int c, int previous, int res) {
        boolean isArea = r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
        if (!isArea) {
            return res;
        }
        if (grid[r][c] >= previous) {
            return res;
        }
        res++;
        int up = dfs(grid, r - 1, c, grid[r][c], res);
        int down = dfs(grid, r + 1, c, grid[r][c], res);
        int left = dfs(grid, r, c - 1, grid[r][c], res);
        int right = dfs(grid, r, c + 1, grid[r][c], res);
        return Math.max(Math.max(up, down), Math.max(left, right));
    }
}
