package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IsPrefixOfWordTest {
    @Test
    public void testIsPrefixOfWord() {
        IsPrefixOfWord isPrefixOfWord = new IsPrefixOfWord();
        assertEquals(4, isPrefixOfWord.isPrefixOfWord("i love eating burger", "burg"));
    }

    @Test
    public void testIsPrefixOfWord2() {
        IsPrefixOfWord isPrefixOfWord = new IsPrefixOfWord();
        assertEquals(2, isPrefixOfWord.isPrefixOfWord2("this problem is an easy problem", "pro"));
    }

    @Test
    public void testIsPrefixOfWord3() {
        IsPrefixOfWord isPrefixOfWord = new IsPrefixOfWord();
        assertEquals(-1, isPrefixOfWord.isPrefixOfWord2("i am tired", "you"));
    }
}
