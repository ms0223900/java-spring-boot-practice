package com.leetcode;

public class MaximumSubArraySum {
    public long maximumSubarraySum(int[] nums, int k) {
        int maxSum = 0;
        for (int i = 0; i < nums.length - k + 1; i++) {
            int sum = 0;
            int preNum = -1;
            for (int j = i; j < i + k; j++) {
                if (preNum == nums[j]) {
                    sum = 0;
                    break;
                }
                sum += nums[j];
                preNum = nums[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

}
