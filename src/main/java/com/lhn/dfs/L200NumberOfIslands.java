package com.lhn.dfs;

/**
 * @author lhn
 * @date 2020/9/1 20:41
 */
public class L200NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(new L200NumberOfIslands().numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                }
                dfs(grid, i, j);
            }
        }
        return res;
    }

    public void dfs(char[][] grid, int r, int c) {
        boolean isArea = r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
        if (!isArea) {
            return;
        }
        if (grid[r][c] != '1') {
            return;
        }
        grid[r][c] = '0';

        dfs(grid, r + 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r - 1, c);
        dfs(grid, r, c - 1);
    }
}
