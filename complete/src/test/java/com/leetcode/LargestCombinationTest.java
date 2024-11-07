package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LargestCombinationTest {

    @Test
    public void testLargestCombination() {
        LargestCombination largestCombination = new LargestCombination();
        assertEquals(4, largestCombination.largestCombination(new int[] { 16, 17, 71, 62, 12, 24, 14 }));
    }

    @Test
    public void testLargestCombinationWithSingleNumber() {
        LargestCombination largestCombination = new LargestCombination();
        assertEquals(2, largestCombination.largestCombination(new int[] { 8, 8 }));
    }

    @Test
    public void testLargestCombinationWithAllSameNumbers() {
        LargestCombination largestCombination = new LargestCombination();
        assertEquals(1, largestCombination.largestCombination(new int[] { 2, 4 }));
    }
}
