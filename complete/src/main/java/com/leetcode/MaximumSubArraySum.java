package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSubArraySum {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
            long sum = 0;

            if (currentSum > 0 && !set.contains(nums[i + k - 1])) {
                sum = currentSum - nums[i - 1] + nums[i + k - 1];
                maxSum = Math.max(maxSum, sum);
                currentSum = sum;
                set.add(nums[i + k - 1]);
                continue;
            }
            for (int j = i; j < i + k; j++) {
                if (set.contains(nums[j])) {
                    sum = 0;
                    set.remove(nums[j]);
                    break;
                }
                set.add(nums[j]);
                sum += nums[j];
            }
            currentSum = sum;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public long maximumSubarraySum2(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            int index = map.getOrDefault(nums[right], -1);

            while (left <= index || (right - left + 1) > k) {
                currentSum -= nums[left];
                left++;
            }

            if ((right - left + 1) == k) {
                maxSum = Math.max(maxSum, currentSum);
            }

            map.put(nums[right], right);
        }

        return maxSum;
    }
}
