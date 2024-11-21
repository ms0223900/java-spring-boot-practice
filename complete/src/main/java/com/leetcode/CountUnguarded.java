package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountUnguarded {
    int wall = 1;
    int guard = 2;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = this.wall;
        }
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = this.guard;
        }

        Set<String> guardedCells = new HashSet<>();
        for (int[] guard : guards) {
            // x to right
            for (int i = guard[0] + 1; i < m; i++) {
                if (isGuarded(grid, i, guard[1])) {
                    break;
                }
                guardedCells.add(i + "," + guard[1]);
            }

            // x to left
            for (int i = guard[0] - 1; i >= 0; i--) {
                if (isGuarded(grid, i, guard[1])) {
                    break;
                }
                guardedCells.add(i + "," + guard[1]);
            }

            // y to top
            for (int j = guard[1] + 1; j < n; j++) {
                if (isGuarded(grid, guard[0], j)) {
                    break;
                }
                guardedCells.add(guard[0] + "," + j);
            }

            // y to bottom
            for (int j = guard[1] - 1; j >= 0; j--) {
                if (isGuarded(grid, guard[0], j)) {
                    break;
                }
                guardedCells.add(guard[0] + "," + j);
            }
        }

        return m * n - guards.length - walls.length - guardedCells.size();
    }

    private boolean isGuarded(int[][] grid, int i, int j) {
        return grid[i][j] == this.guard || grid[i][j] == this.wall;
    }
}
