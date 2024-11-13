package com.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumBeautyTest {
    @Test
    public void testMaximumBeauty() {
        MaximumBeauty maximumBeauty = new MaximumBeauty();
        int[][] nums = { { 1, 2 }, { 3, 2 }, { 2, 4 }, { 5, 6 }, { 3, 5 } };
        int[] queries = { 1, 2, 3, 4, 5, 6 };
        int[] result = maximumBeauty.maximumBeauty(nums, queries);
        assertArrayEquals(new int[] { 2, 4, 5, 5, 6, 6 }, result);
    }

    @Test
    public void testMaximumBeauty2() {
        MaximumBeauty maximumBeauty = new MaximumBeauty();
        int[][] nums = { { 1, 2 }, { 1, 2 }, { 1, 3 }, { 1, 4 } };
        int[] queries = { 1 };
        int[] result = maximumBeauty.maximumBeauty(nums, queries);
        assertArrayEquals(new int[] { 4 }, result);
    }

    @Test
    public void testMaximumBeauty3() {
        MaximumBeauty maximumBeauty = new MaximumBeauty();
        int[][] nums = {
                { 193, 732 }, { 781, 962 }, { 864, 954 }, { 749, 627 },
                { 136, 746 }, { 478, 548 }, { 640, 908 }, { 210, 799 },
                { 567, 715 }, { 914, 388 }, { 487, 853 }, { 533, 554 },
                { 247, 919 }, { 958, 150 }, { 193, 523 }, { 176, 656 },
                { 395, 469 }, { 763, 821 }, { 542, 946 }, { 701, 676 }
        };
        int[] queries = { 885, 1445, 1580, 1309, 205, 1788, 1214, 1404, 572, 1170, 989, 265, 153, 151, 1479, 1180, 875,
                276, 1584 };
        int[] result = maximumBeauty.maximumBeauty(nums, queries);
        assertArrayEquals(new int[] { 962, 962, 962, 962, 746, 962, 962, 962, 946, 962, 962, 919, 746, 746, 962, 962,
                962, 919, 962 }, result);
    }
}
