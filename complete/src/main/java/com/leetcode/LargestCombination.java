package com.leetcode;

import java.util.Arrays;

public class LargestCombination {
    final int BIT_COUNT = 24; // 2^24 > 10^7

    public int largestCombination(int[] candidates) {
        int[] bitCount = new int[BIT_COUNT];
        for (int candidate : candidates) {
            for (int i = 0; i < bitCount.length; i++) {
                // Check if the i-th bit of the candidate is set (1)
                if ((candidate & (1 << i)) != 0) {
                    // Increment the count of numbers having the i-th bit set
                    bitCount[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(bitCount));
        return Arrays.stream(bitCount).max().getAsInt();
    }

    // int largestCombination2(int[] candidates) {
    // for (int i = 0; i < candidates.length; i++) {

    // }

    // }
}
