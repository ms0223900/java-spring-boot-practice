package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinimumTimeTest {
    @Test
    public void testMinimumTime() {
        var minimumTime = new MinimumTime();
        assertEquals(7, minimumTime.minimumTime(new int[][] { { 0, 1, 3, 2 }, { 5, 1, 2, 5 }, { 4, 3, 8, 6 } }));
    }

    @Test
    public void testMinimumTimeNotPossible() {
        var minimumTime = new MinimumTime();
        assertEquals(-1, minimumTime.minimumTime(new int[][] { { 0, 2, 4 }, { 3, 2, 1 }, { 1, 0, 4 } }));
    }
}
