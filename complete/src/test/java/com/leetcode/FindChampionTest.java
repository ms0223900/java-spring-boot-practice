package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindChampionTest {
    @Test
    public void testFindChampion() {
        FindChampion findChampion = new FindChampion();
        assertEquals(0, findChampion.findChampion(3, new int[][] { { 0, 1 }, { 1, 2 } }));
    }

    @Test
    public void testFindChampionWithMultipleChampions() {
        FindChampion findChampion = new FindChampion();
        assertEquals(-1, findChampion.findChampion(3, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 0 } }));
    }

    @Test
    public void testFindChampionWithNoChampion() {
        FindChampion findChampion = new FindChampion();
        assertEquals(-1, findChampion.findChampion(4, new int[][] { { 0, 2 }, { 1, 3 }, { 1, 2 } }));
    }
}
