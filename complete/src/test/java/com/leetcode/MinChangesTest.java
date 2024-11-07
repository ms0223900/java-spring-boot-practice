package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinChangesTest {
    @Test
    public void testMinChanges() {
        MinChanges minChanges = new MinChanges();
        assertEquals(0, minChanges.minChanges("1111"));
    }

    @Test
    public void testMinChangesWithAlternatingCharacters() {
        MinChanges minChanges = new MinChanges();
        assertEquals(2, minChanges.minChanges("1001"));
    }

    @Test
    public void testMinChangesWithAllSameCharacters() {
        MinChanges minChanges = new MinChanges();
        assertEquals(1, minChanges.minChanges("10"));
    }
}
