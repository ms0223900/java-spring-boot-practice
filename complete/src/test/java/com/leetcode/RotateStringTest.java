package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RotateStringTest {
    @Test
    public void testRotateString() {
        Solution rotateString = new Solution();
        assertTrue(rotateString.rotateString("abcde", "cdeab"));
    }

    @Test
    public void shouldReturnFalseIfGoalIsNotRotationOfS() {
        Solution rotateString = new Solution();
        assertFalse(rotateString.rotateString("abcde", "decba"));
    }

    @Test
    public void shouldReturnFalseIfLengthOfSAndGoalIsNotEqual() {
        Solution rotateString = new Solution();
        assertFalse(rotateString.rotateString("abcde", "decbaa"));
    }
}
