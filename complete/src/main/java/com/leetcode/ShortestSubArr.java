package com.leetcode;

public class ShortestSubArr {
    public int findLength(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int[] leftSlice = new int[i];
                System.arraycopy(nums, 0, leftSlice, 0, i);

                int[] rightSlice = new int[nums.length - j];
                System.arraycopy(nums, j, rightSlice, 0, nums.length - j);

                int[] merged = new int[leftSlice.length + rightSlice.length];
                System.arraycopy(leftSlice, 0, merged, 0, leftSlice.length);
                System.arraycopy(rightSlice, 0, merged, leftSlice.length, rightSlice.length);

                if (isSorted(merged)) {
                    res = Math.min(res, j - i);
                }
            }
        }
        return res;
    }

    private boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
