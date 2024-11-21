package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TakeCharactersTest {
    @Test
    public void testTakeCharacters() {
        TakeCharacters takeCharacters = new TakeCharacters();
        assertEquals(8, takeCharacters.takeCharacters("aabaaaacaabc", 2));
    }

    @Test
    public void testTakeCharacters1() {
        TakeCharacters takeCharacters = new TakeCharacters();
        assertEquals(3, takeCharacters.takeCharacters("cbbac", 1));
    }

    @Test
    public void testTakeCharacters2() {
        TakeCharacters takeCharacters = new TakeCharacters();
        assertEquals(0, takeCharacters.takeCharacters("a", 0));
    }
}
