package com.leetcode;

public class GetMaximumXor {

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int maxXor = (1 << maximumBit) - 1;
        int[] res = new int[nums.length];
        int currentXor = 0;

        for (int i = 0; i < nums.length; i++) {
            currentXor ^= nums[i];
            res[nums.length - i - 1] = maxXor ^ currentXor;
        }

        return res;
    }
}
