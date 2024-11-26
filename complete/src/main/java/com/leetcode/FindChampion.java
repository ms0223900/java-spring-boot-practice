package com.leetcode;

public class FindChampion {
    public int findChampion(int n, int[][] grid) {
        int[] incoming = new int[n];
        for (int[] i : grid) {
            incoming[i[1]]++;
        }

        int champion = -1;
        for (int i = 0; i < n; i++) {
            if (incoming[i] == 0) {
                if (champion != -1) {
                    return -1;
                }
                champion = i;
            }
        }
        return champion;
    }
}
