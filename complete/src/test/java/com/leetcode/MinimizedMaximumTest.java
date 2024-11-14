package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimizedMaximumTest {
    @Test
    public void testMinimizedMaximum() {
        MinimizedMaximum mm = new MinimizedMaximum();
        assertEquals(3, mm.minimizedMaximum(6, new int[] { 11, 6 }));
    }

    @Test
    public void testMinimizedMaximum2() {
        MinimizedMaximum mm = new MinimizedMaximum();
        assertEquals(5, mm.minimizedMaximum(7, new int[] { 15, 10, 10 }));
    }

    @Test
    public void testMinimizedMaximum3() {
        MinimizedMaximum mm = new MinimizedMaximum();
        assertEquals(100000, mm.minimizedMaximum(1, new int[] { 100000 }));
    }
}
