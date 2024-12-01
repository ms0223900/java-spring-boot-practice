package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CheckIfExistTest {
    @Test
    public void testCheckIfExist() {
        CheckIfExist checkIfExist = new CheckIfExist();
        assertTrue(checkIfExist.checkIfExist(new int[] { 10, 2, 5, 3 }));
    }

    @Test
    public void testCheckIfExist2() {
        CheckIfExist checkIfExist = new CheckIfExist();
        assertFalse(checkIfExist.checkIfExist(new int[] { 3, 1, 7, 11 }));
    }
}
