package com.leetcode;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MaximumBeauty {
    public int[] maximumBeauty(int[][] nums, int[] queries) {
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> PBMaxList = new ArrayList<>();
        PBMaxList.add(new int[] { nums[0][0], nums[0][1] });
        int lastMaxBeauty = nums[0][1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i][1] > lastMaxBeauty) {
                PBMaxList.add(new int[] { nums[i][0], nums[i][1] });
                lastMaxBeauty = nums[i][1];
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int queryPrice = queries[i];
            for (int j = PBMaxList.size() - 1; j >= 0; j--) {
                if (PBMaxList.get(j)[0] <= queryPrice) {
                    result[i] = PBMaxList.get(j)[1];
                    break;
                }
            }
        }
        return result;
    }

}
