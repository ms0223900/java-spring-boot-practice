package com.leetcode;

import java.util.Arrays;

public class CountFairPairs {
    public int countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        return getCountFairPairsBiggerThanLower(nums, lower) - getCountFairPairsBiggerThanLower(nums, upper + 1);
    }

    private int getCountFairPairsBiggerThanLower(int[] nums, int lower) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] >= lower) {
                    count++;
                }
            }
        }
        return count;
    }
}
