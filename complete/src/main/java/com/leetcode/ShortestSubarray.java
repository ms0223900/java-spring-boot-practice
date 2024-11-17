package com.leetcode;

public class ShortestSubarray {
    public int shortestSubarray(int[] nums, int k) {
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= k) {
                    minLength = Math.min(minLength, j - i + 1);
                    break;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
