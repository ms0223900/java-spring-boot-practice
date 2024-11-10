package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircularSentenceTest {
    @Test
    public void testIsCircularSentence() {
        CircularSentence circularSentence = new CircularSentence();
        assertTrue(circularSentence.isCircularSentence("leetcode exercises sound delightful"));
    }

    @Test
    public void testIsCircularSentence2() {
        CircularSentence circularSentence = new CircularSentence();
        assertFalse(circularSentence.isCircularSentence("cat tiger tiger cat"));
    }

}
