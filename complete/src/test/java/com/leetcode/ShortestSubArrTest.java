package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShortestSubArrTest {
    @Test
    public void testFindLength() {
        ShortestSubArr shortestSubArr = new ShortestSubArr();
        assertEquals(3, shortestSubArr.findLength(new int[] { 1, 2, 3, 10, 4, 2, 3, 5 }));
    }

    @Test
    public void testFindLength2() {
        ShortestSubArr shortestSubArr = new ShortestSubArr();
        assertEquals(4, shortestSubArr.findLength(new int[] { 5, 4, 3, 2, 1 }));
    }

    @Test
    public void testFindLength3() {
        ShortestSubArr shortestSubArr = new ShortestSubArr();
        assertEquals(0, shortestSubArr.findLength(new int[] { 1, 2, 3 }));
    }
}
