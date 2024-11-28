package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShortestDistanceAfterQueriesTest {
    @Test
    public void testShortestDistanceAfterQueries() {
        var shortestDistanceAfterQueries = new ShortestDistanceAfterQueries();
        int[] result = shortestDistanceAfterQueries.shortestDistanceAfterQueries(5,
                new int[][] { { 2, 4 }, { 0, 2 }, { 0, 4 } });
        assertArrayEquals(new int[] { 3, 2, 1 }, result);
    }

    @Test
    public void testShortestDistanceAfterQueries2() {
        var shortestDistanceAfterQueries = new ShortestDistanceAfterQueries();
        int[] result = shortestDistanceAfterQueries.shortestDistanceAfterQueries(4,
                new int[][] { { 0, 3 }, { 0, 2 } });
        assertArrayEquals(new int[] { 1, 1 }, result);
    }

    @Test
    public void testShortestDistanceAfterQueries3() {
        var shortestDistanceAfterQueries = new ShortestDistanceAfterQueries();
        int[] result = shortestDistanceAfterQueries.shortestDistanceAfterQueries(6, new int[][] { { 1, 4 }, { 0, 2 } });
        assertArrayEquals(new int[] { 3, 3 }, result);
    }
}
