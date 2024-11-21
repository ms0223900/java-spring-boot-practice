package com.leetcode;

public class CountUnguarded {
    int guarded = 1;
    int wall = 2;
    int guard = 3;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = this.wall;
        }
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = this.guard;
        }

        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int[] guard : guards) {
            for (int[] direction : directions) {
                int dx = direction[0];
                int dy = direction[1];

                int x = guard[0] + dx;
                int y = guard[1] + dy;

                while (x >= 0 && x < m && y >= 0 && y < n && !isGuarded(grid, x, y)) {
                    grid[x][y] = this.guarded;
                    x += dx;
                    y += dy;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isGuarded(int[][] grid, int i, int j) {
        return grid[i][j] > 1;
    }
}
