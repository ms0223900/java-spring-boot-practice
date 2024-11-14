package com.leetcode;

public class MinimizedMaximum {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1, right = 0;
        for (int quantity : quantities) {
            right = Math.max(right, quantity);
        }
        while (left < right) {
            // JAVA 在這邊會無條件捨去小數點
            int mid = (left + right) / 2;
            if (isPossible(quantities, n, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isPossible(int[] quantities, int n, int mid) {
        int sum = 0;
        for (int quantity : quantities) {
            // 使用整數除法計算需要的數量 mid 的數量
            sum += (quantity + mid - 1) / mid;
        }
        return sum <= n;
    }
}