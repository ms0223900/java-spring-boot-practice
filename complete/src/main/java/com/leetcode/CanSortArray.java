package com.leetcode;

import java.util.Arrays;

public class CanSortArray {
    public boolean canSortArray(int[] nums) {
        int right = nums.length - 1;

        while (right > 0) {
            for (int i = 0; i < right; i++) {
                if (nums[i] > nums[i + 1]) {
                    if (checkCanSort(nums, i, i + 1)) {
                        swap(nums, i, i + 1);
                    }
                }
            }
            right--;
        }
        return Arrays.equals(nums, Arrays.stream(nums).sorted().toArray());
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private boolean checkCanSort(int[] nums, int i, int j) {
        if (Integer.bitCount(nums[i]) != Integer.bitCount(nums[j])) {
            return false;
        }
        return true;
    }
}

class CanSortArray2 {
    public boolean canSortArray(int[] nums) {
        int prevMax = Integer.MIN_VALUE;
        int min = nums[0];
        int max = nums[0];
        int bitCount = Integer.bitCount(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (Integer.bitCount(nums[i]) != bitCount) {
                if (min < prevMax)
                    return false;
                prevMax = max;
                min = nums[i];
                max = nums[i];
                bitCount = Integer.bitCount(nums[i]);
            } else {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }
        }
        return min > prevMax;
    }
}
