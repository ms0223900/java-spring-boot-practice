package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DefuseTheBombTest {
    @Test
    public void testDecrypt() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        assertArrayEquals(new int[] { 12, 10, 16, 13 }, defuseTheBomb.decrypt(new int[] { 5, 7, 1, 4 }, 3));
        assertArrayEquals(new int[] { 12, 10, 16, 13 }, defuseTheBomb.decrypt2(new int[] { 5, 7, 1, 4 }, 3));
    }

    @Test
    public void testDecrypt2() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        assertArrayEquals(new int[] { 0, 0, 0, 0 }, defuseTheBomb.decrypt(new int[] { 1, 2, 3, 4 }, 0));
    }

    @Test
    public void testDecrypt3() {
        DefuseTheBomb defuseTheBomb = new DefuseTheBomb();
        assertArrayEquals(new int[] { 12, 5, 6, 13 }, defuseTheBomb.decrypt(new int[] { 2, 4, 9, 3 }, -2));
        assertArrayEquals(new int[] { 12, 5, 6, 13 }, defuseTheBomb.decrypt2(new int[] { 2, 4, 9, 3 }, -2));
    }
}
