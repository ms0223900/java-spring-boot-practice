package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CanSortArrayTest {

    @Test
    public void testCanSortArray() {
        CanSortArray canSortArray = new CanSortArray();
        CanSortArray2 canSortArray2 = new CanSortArray2();
        assertTrue(canSortArray.canSortArray(new int[] { 2, 4, 8 }));
        assertTrue(canSortArray2.canSortArray(new int[] { 2, 4, 8 }));
    }

    @Test
    public void testCanSortArrayWithOddNumbers() {
        CanSortArray canSortArray = new CanSortArray();
        CanSortArray2 canSortArray2 = new CanSortArray2();
        assertTrue(canSortArray.canSortArray(new int[] { 8, 4, 2, 30, 15 }));
        assertTrue(canSortArray2.canSortArray(new int[] { 8, 4, 2, 30, 15 }));
    }

    @Test
    public void testCanSortArrayWithCannotSort() {
        CanSortArray canSortArray = new CanSortArray();
        CanSortArray2 canSortArray2 = new CanSortArray2();
        assertFalse(canSortArray.canSortArray(new int[] { 8, 4, 2, 30, 16 }));
        assertFalse(canSortArray2.canSortArray(new int[] { 8, 4, 2, 30, 16 }));
    }
}
