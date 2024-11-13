package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountFairPairsTest {
    @Test
    public void testCountFairPairs() {
        CountFairPairs countFairPairs = new CountFairPairs();
        assertEquals(countFairPairs.countFairPairs(new int[] { 0, 1, 7, 4, 4, 5 }, 3, 6), 6);
    }

    @Test
    public void testCountFairPairs2() {
        CountFairPairs countFairPairs = new CountFairPairs();
        assertEquals(countFairPairs.countFairPairs(new int[] { 1, 7, 9, 2, 5 }, 11, 11), 1);
    }
}
