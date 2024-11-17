package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShortestSubArrTest {
    @Test
    public void testFindLength() {
        ShortestSubArr shortestSubArr = new ShortestSubArr();
        assertEquals(3, shortestSubArr.findLengthOfShortestSubarray(new int[] { 1, 2, 3, 10, 4, 2, 3, 5 }));
    }

    @Test
    public void testFindLength2() {
        ShortestSubArr shortestSubArr = new ShortestSubArr();
        assertEquals(4, shortestSubArr.findLengthOfShortestSubarray(new int[] { 5, 4, 3, 2, 1 }));
    }

    @Test
    public void testFindLength3() {
        ShortestSubArr shortestSubArr = new ShortestSubArr();
        assertEquals(0, shortestSubArr.findLengthOfShortestSubarray(new int[] { 1, 2, 3 }));
    }

    @Test
    public void testFindLength4() {
        ShortestSubArr shortestSubArr = new ShortestSubArr();
        assertEquals(7,
                shortestSubArr.findLengthOfShortestSubarray(new int[] { 10, 13, 17, 21, 15, 15, 9, 17, 22, 22, 13 }));
    }
}
