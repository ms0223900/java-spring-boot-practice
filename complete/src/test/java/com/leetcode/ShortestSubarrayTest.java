package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShortestSubarrayTest {
    @Test
    public void testShortestSubarray() {
        ShortestSubarray shortestSubarray = new ShortestSubarray();
        assertEquals(1, shortestSubarray.shortestSubarray(new int[] { 1 }, 1));
    }

    @Test
    public void testShortestSubarray2() {
        ShortestSubarray shortestSubarray = new ShortestSubarray();
        assertEquals(-1, shortestSubarray.shortestSubarray(new int[] { 1, 2 }, 4));
    }

    @Test
    public void testShortestSubarray3() {
        ShortestSubarray shortestSubarray = new ShortestSubarray();
        assertEquals(3, shortestSubarray.shortestSubarray(new int[] { 2, -1, 2 }, 3));
    }

    @Test
    public void testShortestSubarray4() {
        ShortestSubarray shortestSubarray = new ShortestSubarray();
        assertEquals(2, shortestSubarray.shortestSubarray(new int[] { 17, 85, 93, -45, -21 }, 150));
    }

    @Test
    public void testShortestSubarray5() {
        ShortestSubarray shortestSubarray = new ShortestSubarray();
        assertEquals(1, shortestSubarray.shortestSubarray(new int[] { -1, -1, 3, -1, -1 }, 2));
    }
}
