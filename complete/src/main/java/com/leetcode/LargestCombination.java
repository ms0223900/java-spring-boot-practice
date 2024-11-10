package com.leetcode;

import java.util.Arrays;

public class LargestCombination {
    final int BIT_COUNT = 24; // 2^24 > 10^7

    public int largestCombination(int[] candidates) {
        int[] bitCount = new int[BIT_COUNT];
        for (int candidate : candidates) {
            for (int i = 0; i < bitCount.length; i++) {
                if ((candidate & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }
        return Arrays.stream(bitCount).max().getAsInt();
    }
}
