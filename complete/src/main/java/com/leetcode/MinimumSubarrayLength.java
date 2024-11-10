package com.leetcode;

public class MinimumSubarrayLength {
    public int minimumSubarrayLength(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (target == 0) {
            return 1;
        }

        int left = 0;
        int right = 0;
        int prefixSum = 0;
        int minLength = Integer.MAX_VALUE;

        while (right < nums.length && left <= right) {
            prefixSum |= nums[right];
            while (prefixSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                prefixSum = 0;
                left++;
                for (int i = left; i <= right; i++) {
                    prefixSum |= nums[i];
                }
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
