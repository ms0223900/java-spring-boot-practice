package com.leetcode;

public class SubArraysDivByK {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        int[] modCount = new int[k];
        modCount[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int mod = (prefixSum % k + k) % k;
            count += modCount[mod];
            modCount[mod]++;
        }
        return count;
    }
}
