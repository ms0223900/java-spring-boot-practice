package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubArraysDivByKTest {
    @Test
    public void testSubarraysDivByK() {
        SubArraysDivByK subArraysDivByK = new SubArraysDivByK();
        assertEquals(7, subArraysDivByK.subarraysDivByK(new int[] { 4, 5, 0, -2, -3, 1 }, 5));
    }

    @Test
    public void testSubarraysDivByKWithNegativeNumbers() {
        SubArraysDivByK subArraysDivByK = new SubArraysDivByK();
        assertEquals(0, subArraysDivByK.subarraysDivByK(new int[] { 5 }, 9));
    }

    @Test
    public void testSubarraysDivByKWithAllSameNumbers() {
        SubArraysDivByK subArraysDivByK = new SubArraysDivByK();
        assertEquals(1, subArraysDivByK.subarraysDivByK(new int[] { -5 }, 5));
    }
}
