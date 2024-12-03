package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AddSpacesTest {
    @Test
    public void testAddSpaces() {
        AddSpaces addSpaces = new AddSpaces();
        assertEquals("Leetcode Helps Me Learn", addSpaces.addSpaces("LeetcodeHelpsMeLearn", new int[] { 8, 13, 15 }));
        assertEquals("Leetcode Helps Me Learn", addSpaces.addSpaces2("LeetcodeHelpsMeLearn", new int[] { 8, 13, 15 }));
        assertEquals("Leetcode Helps Me Learn", addSpaces.addSpaces3("LeetcodeHelpsMeLearn", new int[] { 8, 13, 15 }));

    }

    @Test
    public void testAddSpaces2() {
        AddSpaces addSpaces = new AddSpaces();
        assertEquals("i code in py thon", addSpaces.addSpaces("icodeinpython", new int[] { 1, 5, 7, 9 }));
        assertEquals("i code in py thon", addSpaces.addSpaces2("icodeinpython", new int[] { 1, 5, 7, 9 }));
        assertEquals("i code in py thon", addSpaces.addSpaces3("icodeinpython", new int[] { 1, 5, 7, 9 }));
    }
}
