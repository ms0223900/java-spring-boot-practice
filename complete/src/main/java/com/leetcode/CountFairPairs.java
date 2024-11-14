package com.leetcode;

import java.util.Arrays;

public class CountFairPairs {
    public int countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        return getCountFairPairsBiggerThanMin(nums, lower) - getCountFairPairsBiggerThanMin(nums, upper + 1);
    }

    private int getCountFairPairsBiggerThanMin(int[] nums, int lower) {
        int count = 0;
        int i = 0;
        int j = nums.length - 1;
        for (j = nums.length - 1; j > 0; j--) {
            i = 0;
            while (i < j) {
                if (nums[i] + nums[j] >= lower) {
                    count += j - i;
                    break;
                }
                i++;
            }
        }
        return count;
    }
}