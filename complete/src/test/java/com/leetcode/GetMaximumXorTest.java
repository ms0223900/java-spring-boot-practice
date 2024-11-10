package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GetMaximumXorTest {

    @Test
    public void testGetMaximumXor() {
        GetMaximumXor getMaximumXor = new GetMaximumXor();
        assertArrayEquals(new int[] { 0, 3, 2, 3 }, getMaximumXor.getMaximumXor(new int[] { 0, 1, 1, 3 }, 2));
    }

    @Test
    public void testGetMaximumXorWithSingleNumber() {
        GetMaximumXor getMaximumXor = new GetMaximumXor();
        assertArrayEquals(new int[] { 5, 2, 6, 5 }, getMaximumXor.getMaximumXor(new int[] { 2, 3, 4, 7 }, 3));
    }

    @Test
    public void testGetMaximumXorWithAllSameNumbers() {
        GetMaximumXor getMaximumXor = new GetMaximumXor();
        assertArrayEquals(new int[] { 4, 3, 6, 4, 6, 7 },
                getMaximumXor.getMaximumXor(new int[] { 0, 1, 2, 2, 5, 7 }, 3));
    }
}
