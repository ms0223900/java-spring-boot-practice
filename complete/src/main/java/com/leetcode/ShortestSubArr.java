package com.leetcode;

public class ShortestSubArr {
    public int findLengthOfShortestSubarray(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i > 0 && j > 0 && nums[i - 1] > nums[j]) {
                    continue;
                }

                int[] merged = new int[i + (nums.length - j)];
                System.arraycopy(nums, 0, merged, 0, i);
                System.arraycopy(nums, j, merged, i, nums.length - j);

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
