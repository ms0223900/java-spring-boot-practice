package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxEqualRowsAfterFlipsTest {
    @Test
    public void testMaxEqualRowsAfterFlips() {
        MaxEqualRowsAfterFlips maxEqualRowsAfterFlips = new MaxEqualRowsAfterFlips();
        assertEquals(2, maxEqualRowsAfterFlips.maxEqualRowsAfterFlips(new int[][] { { 0, 1 }, { 1, 0 } }));
    }

    @Test
    public void testMaxEqualRowsAfterFlips2() {
        MaxEqualRowsAfterFlips maxEqualRowsAfterFlips = new MaxEqualRowsAfterFlips();
        assertEquals(2,
                maxEqualRowsAfterFlips.maxEqualRowsAfterFlips(new int[][] { { 0, 0, 0 }, { 0, 0, 1 }, { 1, 1, 0 } }));
    }
}
