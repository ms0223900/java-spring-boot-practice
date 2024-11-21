package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaximumSubArraySumTest {
    @Test
    public void testMaximumSubArraySum() {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        assertEquals(15, maximumSubArraySum.maximumSubarraySum(new int[] { 1, 5, 4, 2, 9, 9, 9 }, 3));
        assertEquals(15, maximumSubArraySum.maximumSubarraySum2(new int[] { 1, 5, 4, 2, 9, 9, 9 }, 3));
    }

    @Test
    public void testMaximumSubArraySum1() {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        assertEquals(0, maximumSubArraySum.maximumSubarraySum(new int[] { 2, 5, 4, 5 }, 4));
        assertEquals(0, maximumSubArraySum.maximumSubarraySum2(new int[] { 2, 5, 4, 5 }, 4));
    }

    @Test
    public void testMaximumSubArraySum2() {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        assertEquals(0, maximumSubArraySum.maximumSubarraySum(new int[] { 4, 4, 4 }, 3));
        assertEquals(0, maximumSubArraySum.maximumSubarraySum2(new int[] { 4, 4, 4 }, 3));
    }

    @Test
    public void testMaximumSubArraySum3() {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        assertEquals(24, maximumSubArraySum.maximumSubarraySum(new int[] { 1, 1, 1, 7, 8, 9 }, 3));
        assertEquals(24, maximumSubArraySum.maximumSubarraySum2(new int[] { 1, 1, 1, 7, 8, 9 }, 3));
    }

    @Test
    public void testMaximumSubArraySum4() {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        assertEquals(12, maximumSubArraySum.maximumSubarraySum(new int[] { 9, 9, 9, 1, 2, 3 }, 3));
        assertEquals(12, maximumSubArraySum.maximumSubarraySum2(new int[] { 9, 9, 9, 1, 2, 3 }, 3));
    }
}
