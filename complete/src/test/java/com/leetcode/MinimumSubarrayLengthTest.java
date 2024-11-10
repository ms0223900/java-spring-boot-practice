package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumSubarrayLengthTest {

    @Test
    public void testMinSubArrayLen() {
        MinimumSubarrayLength minimumSubarrayLength = new MinimumSubarrayLength();
        assertEquals(2, minimumSubarrayLength.minimumSubarrayLength(new int[] { 2, 3, 1, 2, 4, 3 }, 7));
        assertEquals(1, minimumSubarrayLength.minimumSubarrayLength(new int[] { 1, 2, 3 }, 2));
        assertEquals(3, minimumSubarrayLength.minimumSubarrayLength(new int[] { 1, 2, 32, 21 }, 55));
        assertEquals(1, minimumSubarrayLength.minimumSubarrayLength(new int[] { 1, 2 }, 0));
    }

    @Test
    public void testNotFound() {
        MinimumSubarrayLength minimumSubarrayLength = new MinimumSubarrayLength();
        assertEquals(-1, minimumSubarrayLength.minimumSubarrayLength(new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }, 11));
        assertEquals(-1, minimumSubarrayLength.minimumSubarrayLength(new int[] { 2, 1, 9, 12 }, 21));
    }
}
