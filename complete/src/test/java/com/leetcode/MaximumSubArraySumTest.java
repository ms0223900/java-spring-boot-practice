package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaximumSubArraySumTest {
    @Test
    public void testMaximumSubArraySum() {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        assertEquals(15, maximumSubArraySum.maximumSubarraySum(new int[] { 1, 5, 4, 2, 9, 9, 9 }, 3));
    }

    @Test
    public void testMaximumSubArraySum2() {
        MaximumSubArraySum maximumSubArraySum = new MaximumSubArraySum();
        assertEquals(0, maximumSubArraySum.maximumSubarraySum(new int[] { 4, 4, 4 }, 3));
    }
}
