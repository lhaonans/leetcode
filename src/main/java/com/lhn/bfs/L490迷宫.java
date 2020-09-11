package com.lhn.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lhn
 * @date 2020/9/11 10:20
 */
public class L490迷宫 {

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        int m = maze.length, n = maze[0].length;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        queue.add(start);
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            if (poll[0] == destination[0] && poll[1] == destination[1]) {
                return true;
            }
            for (int[] dir : dirs) {
                int r = poll[0];
                int c = poll[1];
                while (r + dir[0] >= 0 && r + dir[0] < m && c + dir[1] >= 0 && c + dir[1] < n && maze[r + dir[0]][c + dir[1]] == 0) {
                    r += dir[0];
                    c += dir[1];
                }

                if (!visited[r][c]) {
                    queue.add(new int[]{r, c});
                    visited[r][c] = true;
                }
            }
        }
        return false;
    }
}
