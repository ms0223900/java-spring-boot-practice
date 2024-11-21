package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountUnguardedTest {
    @Test
    public void testCountUnguarded() {
        CountUnguarded countUnguarded = new CountUnguarded();
        assertEquals(7, countUnguarded.countUnguarded(4, 6, new int[][] { { 0, 0 }, { 1, 1 }, { 2, 3 } },
                new int[][] { { 0, 1 }, { 2, 2 }, { 1, 4 } }));
    }

    @Test
    public void testCountUnguarded2() {
        CountUnguarded countUnguarded = new CountUnguarded();
        assertEquals(4, countUnguarded.countUnguarded(3, 3, new int[][] { { 1, 1 } },
                new int[][] { { 0, 1 }, { 1, 0 }, { 2, 1 }, { 1, 2 } }));
    }
}
