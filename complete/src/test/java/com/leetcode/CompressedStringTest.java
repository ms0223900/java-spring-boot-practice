package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompressedStringTest {

    @Test
    void allNotSame() {
        CompressedString compressedString = new CompressedString();
        assertEquals("1a1b1c1d1e", compressedString.compressedString("abcde"));
    }

    @Test
    void testCompressedStringWithRepeatedCharacters() {
        CompressedString compressedString = new CompressedString();
        assertEquals("9a2a2b", compressedString.compressedString("aaaaaaaaaaabb"));
    }
}
