package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidArrangementTest {
    @Test
    public void testValidArrangement() {
        var validArrangement = new ValidArrangement();
        assertArrayEquals(new int[][] { { 11, 9 }, { 9, 4 }, { 4, 5 }, { 5, 1 } },
                validArrangement.validArrangement(new int[][] { { 5, 1 }, { 4, 5 }, { 11, 9 }, { 9, 4 } })
                        .toArray(new int[0][]));
    }

    @Test
    public void testValidArrangement2() {
        var validArrangement = new ValidArrangement();
        assertArrayEquals(new int[][] { { 1, 3 }, { 3, 2 }, { 2, 1 } },
                validArrangement.validArrangement(new int[][] { { 1, 3 }, { 3, 2 }, { 2, 1 } }).toArray(new int[0][]));
    }

    @Test
    public void testValidArrangement4() {
        var validArrangement = new ValidArrangement();
        assertArrayEquals(new int[][] { { 17, 18 }, { 18, 10 }, { 10, 18 } },
                validArrangement.validArrangement(new int[][] { { 17, 18 }, { 18, 10 }, { 10, 18 } })
                        .toArray(new int[0][]));
    }
}
